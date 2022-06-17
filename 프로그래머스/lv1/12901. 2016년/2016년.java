class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] str = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sumDate = 0;
        
        for(int i=0; i<a-1; i++) {
            sumDate = sumDate + date[i];
        }
        
        sumDate = sumDate + b - 1;
        
        answer = str[sumDate % 7];
        return answer;
    }
}