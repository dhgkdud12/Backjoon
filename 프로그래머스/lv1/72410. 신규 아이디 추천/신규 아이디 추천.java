class Solution {
    public String solution(String new_id) {
        String result = "";
        
        // 1단계
        new_id = new_id.toLowerCase(); // 소문자로


        // 2단계
        for (int i=0; i<new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                result += c;
            }
        }
        
        // 3단계
        while (result.contains("..")) {
            result = result.replace("..", ".");
        }

        // 4단계
          if (result.length() > 0) {
            if (result.charAt(0) == '.') {
                result = result.substring(1);
            }
        }
        
        if (result.length() > 0) {
            if (result.charAt(result.length() - 1) == '.') {
                result = result.substring(0, result.length() - 1);
            }
        }
        
        // 5단계
        if (result.equals("")) {
            result += "a";
        }

        // 6단계
        if (result.length() >= 16) {
            result = result.substring(0, 15);
            if (result.charAt(result.length() - 1) == '.') {
                result = result.substring(0, result.length() - 1);
            }
        }

        //7단계
               if (result.length() <= 2) {
            while (true) {
                result += result.charAt(result.length()-1);
                if (result.length() > 2)
                    break;
            }
        }

        
        return result;
    }
}