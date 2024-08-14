package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (char c : input.toCharArray()) {
            // 알파벳이 아닌 경우 그대로 출력
            if (!Character.isLetter(c)) {
                System.out.print(c);
                continue;
            }

            char cc = (char) (c + 13);
            if (Character.isLowerCase(c)) { // 소문자 케이스
                if (cc > 'z') {
                    System.out.print((char) (cc - 26));
                } else {
                    System.out.print(cc);
                }
            } else if (Character.isUpperCase(c)) { // 대문자 케이스
                if (cc > 'Z') {
                    System.out.print((char) (cc - 26));
                } else {
                    System.out.print(cc);
                }
            }


        }


    }
}
