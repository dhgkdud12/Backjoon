import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int result = 0;
        int v = 0;
        for (int i=0; i<str.length; i++) {
            v = Integer.parseInt(str[i]);
            result += v*v;
        }

        System.out.println(result%10);

    }
}