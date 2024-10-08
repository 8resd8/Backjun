package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 압축_1662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        Stack<Integer> multiple = new Stack<>();

        int answer = 0;
        int length = 0;
        for (char c : input.toCharArray()) {
            // 곱할 값 저장
            if (c == '(') {
                multiple.push(Character.getNumericValue(stack.peek()));
            }

            if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    length++;
                }
                stack.pop(); // '(' 제거
                stack.pop(); // 곱할 값 제거

                answer = multiple.peek() * length;
                length *= multiple.pop(); // () 안의 길이 늘리기
                continue;
            }
            stack.push(c);
        }

        System.out.println(answer + stack.size()); // 남아있는 스택의 길이 더하기
    }
}