import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i=0; i<7; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList arrayList = new ArrayList();
        int sum = 0;

        for (int a: arr) {
            if (a % 2 != 0) {
                arrayList.add(a);
                sum += a;
            }
        }

        if (arrayList.isEmpty()) {
            System.out.println(-1);
        }
        else {

            Collections.sort(arrayList);

            System.out.println(sum);
            System.out.println(arrayList.get(0));
        }

    }

}