import java.util.*;


public class Main {

    static int[][] check; // 간선 연결상태
    static boolean[] checked; // 확인 여부
    static int n;
    static int m;
    static int v;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 정점
        m = sc.nextInt(); // 간선
        v = sc.nextInt(); // 탐색 시작 정점 번호

        check = new int[1001][1001];
        checked = new boolean[1001];

        for (int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            check[x][y] = check[y][x] = 1;
        }

        dfs(v);

        checked = new boolean[1001];
        System.out.println();

        bfs();
    }

    public static void dfs(int v) {
        checked[v] = true;
        System.out.print(v + " ");

        for (int i=1; i<= n; i++) {
            if (check[v][i] == 1 && checked[i] == false) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        checked[v] = true;
        System.out.print(v+" ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int j=1; j<=n; j++) {
                if (check[temp][j] == 1 && checked[j] == false) {
                    queue.offer(j);
                    checked[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }

}