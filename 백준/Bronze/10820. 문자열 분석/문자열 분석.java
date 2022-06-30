import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while ((input = br.readLine()) != null) {
            char str[] = input.toCharArray();
            int a=0, b=0, c=0, d=0;

            for (char ch:str) {
                if ('a'<= ch && ch <= 'z')
                    a++;
                else if ('A'<= ch && ch <= 'Z')
                    b++;
                else if ('0'<= ch && ch <= '9')
                    c++;
                else d++;
            }

            System.out.printf("%d %d %d %d\n", a,b,c,d);
        }


    }
}