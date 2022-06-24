import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new LinkedList<>();

        for (int i=0; i<n; i++) {
            String str = sc.next();
            switch (str) {
                case "push":
                    q.offer(sc.nextInt());
                    break;
                case "pop":
                    Integer item = q.poll();
                    if (item == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(item).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(q.size()).append("\n");
                    break;
                case "empty" :
                    if (q.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    Integer it = q.peek();
                    if (it == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(it).append('\n');
                    }
                    break;
                case "back" :
                    Integer ite = q.peekLast();
                    if (ite == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(ite).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}