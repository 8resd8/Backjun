package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            boolean acceptable = true;
            if (input.equals("end")) return;

            // 1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
            if (!input.contains("a") && !input.contains("e") && !input.contains("i")
                    && !input.contains("o") && !input.contains("u")) {
                acceptable = false;
            }

            int moem = 0;
            int jaem = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                // 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    moem++;
                    jaem = 0;
                } else {
                    moem = 0;
                    jaem++;
                }

                if (moem >= 3 || jaem >= 3) {
                    acceptable = false;
                }

            }

            // 3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
            for (int j = 0; j < input.length() - 1; j++) {
                char c1 = input.charAt(j);
                char c2 = input.charAt(j + 1);
                if (c1 == c2) {
                    if (c1 != 'e' && c1 != 'o') {
                        acceptable = false;
                    }
                }
            }

            System.out.printf("<%s> is %s.\n", input, acceptable ? "acceptable" : "not acceptable");
        }


    }
}