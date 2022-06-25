import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                arrayList.remove(arrayList.size()-1);
            } else {
                arrayList.add(a);
            }
        }
        Integer sum = 0;
        for (Integer a : arrayList) {
             sum += a;
        }

        System.out.println(sum);

    }
}