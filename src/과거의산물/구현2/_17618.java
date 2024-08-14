package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        int answer = 0;

        for (int i = 1; i <= Integer.parseInt(t); i++) {
            int number = i;

            int magicNumber = 0;
            while (number > 0) {
                magicNumber += number % 10;
                number /= 10;
            }
            if (i % magicNumber == 0) {
                answer++;
            }
        }


        System.out.println(answer);
    }
}