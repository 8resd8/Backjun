package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean tag = false;

        for (char c : input.toCharArray()) {
            // 태그가 있다면 그대로 넣기, 태그 시작표시를 만나면 정산
            if (c == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                tag = true;
            }

            if (c == '>') {
                tag = false;
                sb.append(c);
                continue;
            }

            if (tag) {
                sb.append(c);
                continue;
            }

            // 공백을 만나면 정산
            if (c == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
                continue;
            }
            // 여기가 오는것은 태그가 없는 과거의산물.문자열
            stack.push(c);


        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);


    }
}