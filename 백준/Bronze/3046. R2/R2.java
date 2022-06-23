import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int s = sc.nextInt();

        int r2 = s * 2 - r1;

        System.out.println(r2);
    }

}