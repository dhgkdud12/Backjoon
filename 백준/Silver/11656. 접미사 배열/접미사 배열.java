import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = new String[s.length()];
        for (int i=0; i<s.length(); i++) {
            str[i] = s.substring(i);
        }
        Arrays.sort(str);
        for (String ss : str) {
            System.out.println(ss);
        }

    }
}