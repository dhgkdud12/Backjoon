import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[3][2];

        for (int i=0; i<3; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        if (arr[0][0] == arr[1][0]) {
            sb.append(arr[2][0]).append(' ');
        } else if (arr[1][0] == arr[2][0]) {
            sb.append(arr[0][0]).append(' ');
        } else {
            sb.append(arr[1][0]).append(' ');
        }

        if (arr[0][1] == arr[1][1]) {
            sb.append(arr[2][1]).append(' ');
        } else if (arr[1][1] == arr[2][1]) {
            sb.append(arr[0][1]).append(' ');
        } else {
            sb.append(arr[1][1]);
        }

        System.out.println(sb);
    }
}