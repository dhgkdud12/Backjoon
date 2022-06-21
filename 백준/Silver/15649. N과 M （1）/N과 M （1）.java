import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int[] arr = new int[n];
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        for (int i=0; i<n; i++) {
            arr[i] = i+1;
        }


        perm(arr, output, visited, 0, n, r);


    }

    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    public static void print(int[] arr, int r) {
        for (int i=0; i<r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}