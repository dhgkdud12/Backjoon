import java.util.Scanner;

public class Main {
    public static int pow5(int n) {
        return n*n*n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] st = str.split("");
        int result = 0;

        for (int i=0; i<st.length; i++) {
            result += pow5(Integer.parseInt(st[i]));
        }

        System.out.println(result);


    }
}