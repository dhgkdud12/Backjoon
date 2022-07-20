import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K;
    static long[] nums;
    static long[] tree;
    static int S;
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("src/DAY03/P2042/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        nums = new long[N+1];

        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(br.readLine()); 
        }

        S = 1;
        while (S < N) {
            S *= 2;
        }
        tree = new long[S * 2]; 

        initBU();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M + K; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); 
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {
                long diff = c - tree[S + b -1];
                update(1, S, 1, b, diff);
            } else if (a == 2) {
                sb.append(query(1, S, 1, b, (int)c) + "\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }

    static void initBU() {
        // Leaf에 값 반영
        for (int i = 0; i < N; i++) {
            tree[S + i] = nums[i]; 
        }
        // 내부노드 채움
        for (int i =  S - 1; i > 0 ; i--) { 
            tree[i] = tree[i*2] + tree[i*2+1]; 
        }
    }

    static long query(int left, int right, int node, int queryLeft, int queryRight) {
        // 연관이 없음 -> 결과에 영향이 없는 값 return
        if (queryRight < left || right < queryLeft) {
            return 0;
        }
        // 판단 가능 -> 현재 노드 값 return
        else if (queryLeft <= left && right <= queryRight) {
            return tree[node];
        }
        // 판단불가, 자식에게 위임, 자식에게 올라온 합을 return
        else {
            int mid = (left + right) / 2;
            long resultLeft = query(left, mid, node *  2, queryLeft, queryRight); // 왼쪽 자식
            long resultRight = query(mid+1, right, node * 2 + 1, queryLeft, queryRight); // 오른쪽 자식
            return resultLeft + resultRight;
        }
    }


    static void update(int left, int right, int node, int target, long diff) {
        // 연관없음
        if (target < left || right < target) {
            return;
        }
        // 연관있음 -> 현재 노드에 diff 반영 -> 자식에게 diff 전달
        else {
            tree[node] += diff; 
            if (left != right) { // 내부노드인 경우
                int mid = (left + right) / 2;
                update(left, mid, node * 2, target, diff);
                update(mid+1, right, node * 2 + 1, target, diff);
            } else {
                nums[target] += tree[node];
                return;
            }
        }
    }

}
