import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int five = 0;
        for (int i=1; i<=n; i++) {
            int m = i;
            while (m%5 == 0) {
                five++;
                m/=5;
            }
        }
        System.out.println(five);
    }

}