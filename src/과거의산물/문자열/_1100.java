package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int number = 0;
        for (int i = 0; i < 8; i++) {
            // i값이 홀수면 서로 바뀌기
            number = i % 2 == 1 ? 1 : 0;
            String input = br.readLine();

            for (int j = 0; j < 8; j++) {
                if (j % 2 == number && input.charAt(j) == 'F') {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}