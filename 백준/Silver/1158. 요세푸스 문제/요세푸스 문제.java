import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        Queue<Integer> q = new LinkedList<>();

        for (int i=0; i<n; i++) {
            q.add(i+1);
        }

        System.out.print("<");
        while (q.size()>0) {
            for (int i=0; i<k-1; i++) {
                q.add(q.poll()); // 3, 4, 5, 6, 7, 1, 2
            }
            System.out.print(q.poll()); // 3
            if (!q.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println(">");


    }
}