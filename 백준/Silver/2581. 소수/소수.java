import java.awt.print.Pageable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] prime = new int[n+1];

        for (int i=0; i<=n; i++) prime[i] = 0;
        prime[1] = 1;

        for (int i=2; i<=n; i++) {
            for (int j=2; i*j<=n; j++) {
                prime[i*j] = 1;
            }
        }

        int result = 0;
        int min = n;

        for (int i=m; i<=n; i++) {
            if (prime[i]!=1) {
                if (min > i) min = i;
                result += i;
            }
        }
        if (result == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(result);
            System.out.println(min);
        }




    }
}