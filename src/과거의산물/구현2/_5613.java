package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5613 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(br.readLine());

        while (true) {
            String input = br.readLine();
            if (input.equals("=")) {
                System.out.println(answer);
                break;
            }

            if (input.equals("+")) {
                input = br.readLine();
                answer += Integer.parseInt(input);
            } else if (input.equals("-")) {
                input = br.readLine();
                answer -= Integer.parseInt(input);
            } else if (input.equals("*")) {
                input = br.readLine();
                answer *= Integer.parseInt(input);
            } else if (input.equals("/")) {
                input = br.readLine();
                answer /= Integer.parseInt(input);
            }
        }


    }


}