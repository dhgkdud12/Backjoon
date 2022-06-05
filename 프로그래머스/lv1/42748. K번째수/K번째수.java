import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int a=0; a<commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            ArrayList<Integer> arrayList = new ArrayList<>();

            int c = i-1;
            if (j-c==0) arrayList.add(array[i-1]);


            for (int b=0; b<j-i+1;b++) {
                arrayList.add(array[c]);
                c++;
            }

            Collections.sort(arrayList);
            result.add(arrayList.get(k-1));

        }
        
        int[] answer = new int[result.size()];

        for (int d=0; d<result.size(); d++) {
            answer[d] = result.get(d).intValue();
        }
        
        return answer;
    }
}