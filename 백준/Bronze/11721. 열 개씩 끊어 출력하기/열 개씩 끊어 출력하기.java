import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length()/10;
        int i = 0;
        for (i=0; i<str.length()/10; i++) {
            System.out.println(str.substring(i*10, i*10+10));
        }
        System.out.println(str.substring(i*10));
    }

}