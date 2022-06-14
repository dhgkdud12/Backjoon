import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        for (int i=1; i<in; i++) {
            int result = i;
            int a = i;
            while (a>0) {
                result += a%10;
                a/= 10;
            }
            if (result == in) {
                arrayList.add(i);
            }
        }

        if (arrayList.isEmpty()) System.out.println("0");
        else System.out.println(arrayList.get(0));
    }
}
