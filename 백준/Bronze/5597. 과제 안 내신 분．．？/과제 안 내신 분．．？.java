import java.util.Scanner;

public class Main {
    public static int pow5(int n) {
        return n*n*n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        int[] result = new int[2];

        for (int i=0; i<28; i++) {
            arr[sc.nextInt()] = 1;
        }

        int j = 0;
        for (int i=1; i<=30; i++) {
            if (arr[i] != 1) {
                result[j] = i;
                j++;
            }
        }

        for (int i=0; i<2; i++) {
            System.out.println(result[i]);
        }


    }
}