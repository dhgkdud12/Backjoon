import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];
            boolean group = true; // 그룹 단어 체크
            for (int j=0; j<str.length(); j++) {
                if (check[str.charAt(j) - 'a'] == true) { // 방문했으면
                    if (str.charAt(j-1) != str.charAt(j)) {
                        group = false;
                        break;
                    }
                }
                check[str.charAt(j) - 'a'] = true;

            }
            if (group) count++;
        }
        System.out.println(count);

    }
}