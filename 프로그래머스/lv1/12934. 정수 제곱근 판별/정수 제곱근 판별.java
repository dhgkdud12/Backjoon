class Solution {
    public long solution(long n) {
        long q = (long)Math.sqrt(n);
        long answer = 0;
        if (q*q == n)
            answer = (long)Math.pow(q+1, 2);
        else answer = -1;
        
        return answer;
    }
}