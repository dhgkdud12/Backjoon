import java.util.Scanner;

public class Main {
    public static int pow5(int n) {
        return n*n*n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }

        System.out.println(sb);

    }
}