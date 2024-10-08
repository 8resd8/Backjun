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

        int length = 0;
        int answer = 0;
        for (char c : input.toCharArray()) {
            // 곱할 값 저장
            if (c == '(') {
                multiple.push(Character.getNumericValue(stack.peek()));
            }

            if (c == ')') {
                while (!multiple.isEmpty()) {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        stack.pop();
                        length++;
                    }
                    stack.pop(); // '(' 제거
                    stack.pop(); // 곱할 숫자 제거
                    length = length * multiple.pop();

                }
                answer += length;
                System.out.println("length = " + length);
                length = 0;
                continue;
            }
            stack.push(c);
        }

        System.out.println(stack);
        System.out.println(answer + stack.size()); // 남아있는 스택의 길이 더하기
    }
}
/*
15(22)13(92(1111)42(222))
answer: 60

15(22)13(92(1111)42(222))123(1)45
answer: 67

4(3(5(1)))1
answer: 61

3(5(1))1
answer: 16

 */


