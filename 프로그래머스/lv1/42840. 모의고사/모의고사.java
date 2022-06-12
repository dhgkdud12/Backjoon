import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arrayList = new ArrayList();

        
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int[] score = {0,0,0};

        for (int i=0; i<answers.length; i++) {
            if (first[i%5] == answers[i]) score[0]++;
            if (second[i%8] == answers[i]) score[1]++;
            if (third[i%10] == answers[i]) score[2]++;
        }

        int arr[] = new int[score.length];
        for (int i=0; i< score.length; i++) {
            arr[i] = score[i];
        }

        Arrays.sort(score);

        for (int i=0; i< score.length; i++) {
            if (score[2] == arr[i]) {
                arrayList.add(i+1);
            }
        }

        int answer[] = new int[arrayList.size()];
        for (int i=0; i< arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        
        
        
        return answer;
    }
}