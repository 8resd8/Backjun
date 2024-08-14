package 과거의산물.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        int totalPiece = 0; // 총 잘린 막대 개수
        char previous = 0; // 이전 문자 확인을 위한 변수

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);

                // 이전 문자 갱신
                previous = '(';
            } else if (c == ')') {
                // 선이 있는 상태 && 선이 끊기는 경우 1개 증가시켜줘야 한다.
                if (!stack.isEmpty() && previous == ')') {
                    totalPiece++;
                }

                // 기본으로 1개 빼주기
                stack.pop();

                // 선이 있는 상태 && 문자가 ()인 경우 생성된 선 만큼 더하기
                if (!stack.isEmpty() && previous == '(') {
                    totalPiece += stack.size();
                }

                // 이전 문자 갱신
                previous = ')';
            }

        }
        System.out.println(totalPiece);


    }
}