import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("#"))
                break;

            str = str.toUpperCase();
            int count = 0;
            for (int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
                    count++;
            }
            System.out.println(count);


        }


    }

}