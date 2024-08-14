package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char moyang = ' ';
        int answer = 0;

        for (char c : input.toCharArray()) {
            if (c != moyang) {
                answer += 10;
            } else {
                answer += 5;
            }
            moyang = c;
        }
        System.out.println(answer);


    }
}
