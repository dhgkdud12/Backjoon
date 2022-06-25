import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }
        System.out.println(sb);

    }

    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }
            else if (s.charAt(i) == ')'){
                if (stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }

        if (stack.isEmpty()) return "YES";
        else return "NO";
    }
}