package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String question = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            boolean flag = false;
            if (input.charAt(i) == question.charAt(0)) {
                for (int j = 0; j < question.length(); j++) {
                    if (i + j < input.length() && input.charAt(i + j) == question.charAt(j)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(1);
                return;
            }

        }
        System.out.println(0);


    }
}