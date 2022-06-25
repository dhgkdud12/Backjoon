import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StackImp stack = new StackImp(n);
        int sum = 0;

        for (int i=0; i<n; i++) {
            int c = Integer.parseInt(br.readLine());

            if (c>0) {
                stack.push(c);
                sum += c;
            }

            else if (c==0) {
                sum -= stack.pop();
            }
        }

        System.out.println(sum);

    }

    public static class StackImp {
        static int[] arr;
        static boolean empty;
        static int top;

        public StackImp(int size) {
            this.arr = new int[size];
            this.empty = true;
            this.top = 0;
        }

        public static void push(int i) {
            arr[top] = i;
            top ++;
            empty = false;
        }

        public static int pop() {
            if (empty) return -1;

            top--;
            int i = arr[top];
            if (top==0) empty = true;

            return i;
        }

        public static int empty() {
            if (empty) return 1;
            return 0;
        }

        public static int top() {
            if (empty) return -1;

            return arr[top-1];
        }
    }
}