import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str  = new String[n];

        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            sb.append(str[i].charAt(0)).append(str[i].charAt(str[i].length()-1)).append("\n");
        }
        System.out.println(sb);

    }
}