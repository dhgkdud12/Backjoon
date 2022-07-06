import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;
        for (int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
                mod = arr[i];
                check = true;
            } else if (max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }

        System.out.println(Math.round((double)sum/n));
        System.out.println(arr[n/2]);
        System.out.println(mod);
        System.out.println(arr[n-1]-arr[0]);
    }
}