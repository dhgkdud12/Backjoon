class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pl = 0;
        int yl = 0;
        
        s = s.toUpperCase();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
            if (c == 'P') pl++;
            else if (c == 'Y') yl++;
        }

        if (pl == yl) answer = true;
        else answer = false;


        return answer;
    }
}