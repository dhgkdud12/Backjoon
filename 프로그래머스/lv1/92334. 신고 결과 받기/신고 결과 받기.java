import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet> map = new HashMap<>(); // 신고당한 유저 : 신고한 유저
        Map<String, Integer> idxMap = new HashMap<>(); // 유저 : 유저 인덱스
        
        for(int i=0; i<id_list.length; i++) {
            map.put(id_list[i], new HashSet());
            idxMap.put(id_list[i], i);
        }
        
        for(String s : report) {
            String[] str = s.split(" ");
            String from = str[0]; // 신고한 유저
            String to = str[1]; // 신고당한 유저
            map.get(to).add(from);
        }
        
        for(int i=0; i<id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if(send.size() >= k) { // 신고횟수 k이상이면
                for(String name: send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
        
        return answer;
    }
}