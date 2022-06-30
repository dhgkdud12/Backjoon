import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        String[][] srr = new String[8][8];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<8; i++) {
            String[] str = br.readLine().split("");
            for (int j=0; j<8; j++) {
                srr[i][j] = str[j];
            }
        }

        int count = 0;
        int j=0;
        for (int i=0; i<8; i++) {
            if (i % 2 == 0) j = 0;
            else j = 1;
            for (; j < 8; j = j + 2) {
                if (srr[i][j].equals("F"))
                    count++;
            }
        }
        System.out.println(count);


    }
}