package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            String input = br.readLine();
            String result = "";

            if (input.equals("#")) {
                break;
            }

            // 1의 개수가 홀수: 홀수 패리티 (o)
            // 1, 0의 개수가 짝수: 짝수 패리티 (e)

            // 1. 홀수 패리티인 경우 1의 개수를 확인 -> 짝수라면 1, 홀수라면 0으로 변경
            // 2. 짝수 패리티인 경우 1과 0 중에 홀수인 것을 확인하여 마지막에 홀수인 숫자로 변경해서 짝수만들기

            for (int i = 0; i < input.length() - 1; i++) {
                char c = input.charAt(i);
                result += c;

                if (input.length() - 1 == 'o') { // 홀수 패리티 확인
                    if (c == '1') {
                        sb.append(c);
                    }
                } else { // 짝수 패리티 확인
                    if (c == '1') {
                        sb.append(1);
                    }
                }
            }


            if (input.charAt(input.length() - 1) == 'o') {
                if (sb.length() % 2 == 0) {
                    result += '1';
                } else {
                    result += '0';
                }
            } else {
                if (sb.length() % 2 != 0) {
                    result += '1';
                } else {
                    result += '0';
                }
            }


            System.out.println(result);

        }


    }
}