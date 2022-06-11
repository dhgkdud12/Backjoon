import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pickNum = nums.length/2;
        
        Set<Integer> hashSet = new HashSet<>();

        for (int n : nums) {
            hashSet.add(n);
        }

        answer =  (hashSet.size() <= pickNum) ? hashSet.size() : pickNum;
        
        return answer;
    }
}