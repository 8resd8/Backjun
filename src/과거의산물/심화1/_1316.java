package 과거의산물.심화1;

import java.util.Arrays;
import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Boolean[] visited = new Boolean[26]; // 알파벳_1987 개수
            Arrays.fill(visited, false);
            boolean groupWord = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (j > 0 && c != s.charAt(j - 1) && visited[c - 'a']) {
                    groupWord = false;
                    break;
                }
                visited[c - 'a'] = true;
            }
            if (groupWord) {
                count++;
            }

        }
        System.out.println(count);
    }
}