import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<Integer>();

        for (int i=0; i< moves.length; i++) {
            int col = moves[i] - 1;

            for (int j=0; j<board[0].length; j++) {
                int current = board[j][col];
                if (current != 0) {
                    if (bucket.size() >= 1 && bucket.peek() == current) {
                        board[j][col] = 0;
                        bucket.pop();
                        answer += 2;
                        break;
                    }

                    else {
                        bucket.push(current);
                        board[j][col] = 0;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}