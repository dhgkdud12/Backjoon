import java.awt.print.Pageable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();

        Arrays.sort(arr);

        for (int i= arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}