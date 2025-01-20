package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 안정적인문자열_4889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (true) {
            i++;
            String input = br.readLine();
            if (input.startsWith("-")) break;

            Stack<Character> stack = new Stack<>();
            int count = 0;

            for (char c : input.toCharArray()) {
                if (c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) { // }인데 비어있으면 증가
                        count++;
                        stack.push(c);
                    } else {
                        stack.pop(); // }이 들어가있으면 바로 삭제
                    }
                }
            }

            count += stack.size() / 2;
            sb.append(i).append(". ").append(count).append("\n");
        }

        System.out.print(sb);
    }
}
