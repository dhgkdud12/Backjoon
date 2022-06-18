import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        ArrayList<String> arrayList = new ArrayList(strings.length);
        for (int i=0; i< strings.length; i++) {
            arrayList.add(strings[i].charAt(n)+strings[i]);
        }
        
        Collections.sort(arrayList);

        String[] result = new String[strings.length];

        for (int i=0; i< arrayList.size(); i++) {
            result[i] = arrayList.get(i).substring(1);
        }
        return result;

    }        
}