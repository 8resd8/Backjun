package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int distance = B.length() - A.length();
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= distance; i++) {
            int current = 0;

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    current++;
                }
            }

            if (current < answer) {
                answer = current;
            }
        }

        System.out.println(answer);
    }
}
