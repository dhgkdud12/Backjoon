import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        double score = 0;

        switch (str[0]) {
            case "A" :
                score = 4.0;
                break;
            case "B" :
                score = 3.0;
                break;
            case "C" :
                score = 2.0;
                break;
            case "D" :
                score = 1.0;
                break;
            case "F" :
                score = 0.0;
                break;
        }

        if (str.length>1) {
            switch (str[1]) {
                case "+" :
                    score += 0.3;
                    break;
                case "-" :
                    score -= 0.3;
                    break;
            }
        }

        System.out.println(score);


    }
}