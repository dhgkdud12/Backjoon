import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[3];
        for (int i=0; i<3; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int temp, index = 0, i, j;
        for (i=0; i<3; i++) {
            int min = 1000000;
            for (j=i; j<3; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }

        StringBuilder sb = new StringBuilder();

        for (int a: arr) {
            sb.append(a).append(' ');
        }
        System.out.println(sb);
    }
}