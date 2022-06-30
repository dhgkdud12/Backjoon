import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        String[][] srr = new String[8][8];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("-");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length; i++) {
            sb.append(str[i].charAt(0));
        }
        System.out.println(sb);

    }
}