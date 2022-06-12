import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        
        String string = "";
        for (int i=charArr.length-1; i>=0; i--) {
            string += charArr[i];
        }

        answer = Long.parseLong(string);
        
        return answer;
    }
}