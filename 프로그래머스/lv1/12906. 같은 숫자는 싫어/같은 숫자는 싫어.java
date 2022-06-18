import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (i>0 && arr[i-1] == arr[i] )
                continue;
            else arrayList.add(arr[i]);
        }
        
        int[] answer = new int[arrayList.size()];
        for (int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}