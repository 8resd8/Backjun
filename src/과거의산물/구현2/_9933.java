package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _9933 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            // 비밀번호: 팰린드롬 or 입력의 반대 값이 목록에 포함되어 있다

            // 1. 팰린드롬 체크
            boolean isPalindrome = true;
            for (int j = 0; j < input.length() / 2; j++) {
                if (input.charAt(j) != input.length() - 1) {
                    isPalindrome = false;
                    break;
                }
            }

            // 2. 입력의 거꾸로 값이 있는지 확인
            boolean isReverseWord = false;
            set.add(input);
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                sb.append(input.charAt(input.length() - 1 - j));
            }
            String reversWord = sb.toString();

            if (set.contains(reversWord)) {
                isReverseWord = true;
            }


            // 답이 유일한 경우로 입력으로 주어진다.
            String s = input.length() + " " + input.charAt(input.length() / 2);
            if (isPalindrome) {
                System.out.print(s);
                break;
            }

            if (isReverseWord) {
                System.out.print(s);
                break;
            }
        }


    }


}