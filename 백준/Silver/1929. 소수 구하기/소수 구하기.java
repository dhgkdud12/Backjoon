import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] isPrime = new int[m+1];

        isPrime[1] = 1;

        for (int i=2; i<=m; i++) {
            for (int j=2; i*j<=m;j++ ){
                isPrime[i*j] = 1;
            }
        }

        for (int i=n; i<=m; i++) {
            if (isPrime[i] != 1)
                System.out.println(i);
        }

    }
}