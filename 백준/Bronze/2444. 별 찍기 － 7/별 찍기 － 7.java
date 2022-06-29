import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n; i++) {
            for (int k=n-i; k>0; k--) {
                System.out.print(" ");
            }
            for (int j=1; j<2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<n; i++) {
            for (int k=0; k<i; k++) {
                System.out.print(" ");
            }
            for (int j=2*n-(i+1); j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}