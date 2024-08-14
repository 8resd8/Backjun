package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (char c : input.toCharArray()) {
            // 65 미만일 경우 +25
            // 90 초과일 경우 -25
            int newC = c - 3;
            if (newC < 65) newC += 26;
            else if (newC > 90) newC -= 26;

            System.out.print((char) newC);
        }

    }
}