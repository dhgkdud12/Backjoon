import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        int f1 = 0;
        int f2 = 1;

        for (int i=0; i<9; i++) {
            for (int j=i+1; j<9; j++) {
                if (sum-(arr[i]+arr[j]) == 100)
                {
                    f1 = arr[i];
                    f2 = arr[j];
                    break;
                }
            }
        }

        for (int i=0; i<9; i++) {
            if (arr[i] != f1 && arr[i] != f2)
                System.out.println(arr[i]);
        }

    }
}