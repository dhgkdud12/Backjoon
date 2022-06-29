import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n+1; i++) {
            for (int j=n-i; j<n; j++) {
                System.out.print("*");
            }
            for (int k=2*n-(2*i); k>0; k--) {
                System.out.print(" ");
            }
            for (int j=n-i; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<n+1; i++) {
            for (int j=n-i; j>0; j--) {
                System.out.print("*");
            }
            for (int k=0; k<2*i; k++) {
                System.out.print(" ");
            }
            for (int j=n-i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}