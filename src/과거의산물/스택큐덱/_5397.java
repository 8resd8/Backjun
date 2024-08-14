package 과거의산물.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            Stack<Character> temp = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (c == '-') { // 백스페이스
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (c == '<') { // 한 칸 뒤로 이동
                    if (!stack.isEmpty()) {
                        temp.push(stack.pop());
                    }
                } else if (c == '>') { // 한 칸 오른쪽 이동
                    if (!temp.isEmpty()) {
                        stack.push(temp.pop());
                    }
                } else { // 입력
                    stack.push(c);
                }
            }

            // 이동했는데 입력이 끝난 경우 정산
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }


            for (Character c : stack) {
                sb.append(c);
            }
            System.out.println(sb);
        }


    }
}