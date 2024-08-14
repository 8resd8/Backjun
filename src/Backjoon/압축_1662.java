package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 압축_1662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Stack<String> stack = new Stack<>();

        for (String s : arr) {
            if (!s.equals(")")) {
                stack.push(s);
            } else {
                int cnt = 0;

                while (!stack.peek().equals("(")) {
                    if (stack.pop().equals("%")) {
                        int len = Integer.parseInt(stack.pop());
                        cnt += len;
                    } else cnt++;
                }

                stack.pop(); // ( 제거
                int k = Integer.parseInt(stack.pop());
                cnt = cnt * k;

                stack.push(String.valueOf(cnt));
                stack.push("%");
            }
        }

        int answer = 0;
        while (!stack.empty()) {
            if (stack.peek().equals("%")) {
                stack.pop();
                answer += Integer.parseInt(stack.pop());
            } else {
                stack.pop();
                answer++;
            }
        }
        System.out.println(answer);
    }
}