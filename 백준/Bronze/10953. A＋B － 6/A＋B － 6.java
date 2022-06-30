import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i=0; i<n; i++) {
            String[] str = br.readLine().split(",");
            sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            System.out.println(sum);
        }

    }
}