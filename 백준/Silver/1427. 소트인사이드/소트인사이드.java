import java.awt.print.Pageable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int n = m;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (n>0) {
            arrayList.add(n%10);
            n/=10;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        for (Integer a : arrayList) {
            System.out.print(a);
        }
    }
}