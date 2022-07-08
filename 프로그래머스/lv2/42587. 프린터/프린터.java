import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐

        for (int i=0; i< priorities.length; i++) {
            pq.offer(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i=0; i<priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    answer++;
                    pq.poll();
                    if (location == i) return answer;
                }
            }
        }
        return answer;
    }
}