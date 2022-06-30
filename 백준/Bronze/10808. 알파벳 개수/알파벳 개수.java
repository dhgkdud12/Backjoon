import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();
        char c;
        for (int i=0; i<str.length(); i++) {
            c = str.charAt(i);
            arr[c - 'a'] ++;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }


    }
}