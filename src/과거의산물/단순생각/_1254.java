package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 입력이 팰린드롬이면 길이 그대로 출력
        if (checkPal(input)) {
            System.out.println(input.length());
            return;
        }

        // 여기부턴 팰린드롬이 아님. 과거의산물.문자열 추가해주기.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            StringBuilder result = new StringBuilder(input);
            sb.append(input.charAt(i)).reverse();

            if (checkPal(result.append(sb).toString())) {
                System.out.println(result.length());
                return;
            }
            sb.reverse(); // 팰린드 체크가 안되면 원래대로 복구
        }
    }

    private static boolean checkPal(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}