import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int result = 0;
        if (a==b && b==c) {
            result = 10000 + (a*1000);
        } else if (a==b || a==c) {
            result = 1000+(a*100);
        } else if (b==c) {
            result = 1000+(b*100);
        } else {
            result = Math.max(a*100, Math.max(b*100, c*100));
        }
        System.out.println(result);

    }
}