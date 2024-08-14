package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _20955SWEA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String S = br.readLine();
            String E = br.readLine();
            boolean canMake = false;
            Set<String> results = new HashSet<>();
            Queue<String> queue = new LinkedList<>();
            // a. S로 E를 만들 수 있는가? 실패
            // 1. S제일 뒤 X 붙이기
            // 2. S뒤집고 Y 붙이기

            // b. E를 S로 만들 수 있는가?
            // 1. E 뒤에 X를 뺀다
            // 2. E 제일 뒤를 빼고 뒤집는다

            queue.add(E);
            results.add(E);

            while (!queue.isEmpty()) {
                String e = queue.poll();
                if (e.equals(S)) {
                    canMake = true;
                    break;
                }
                if (S.length() >= e.length()) continue;

                if (e.endsWith("X")) {
                    String newStr = e.substring(0, e.length() - 1);
                    if (results.add(newStr)) queue.add(newStr);
                }

                if (e.endsWith("Y")) {
                    String newStr2 = new StringBuilder(e.substring(0, e.length() - 1)).reverse().toString();
                    if (results.add(newStr2)) queue.add(newStr2);
                }

            }

            if (canMake) {
                answer.append("#").append(i + 1).append(" Yes\n");
            } else {
                answer.append("#").append(i + 1).append(" No\n");
            }
        }


        System.out.println(answer);
    }
}