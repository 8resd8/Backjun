package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String[] input = br.readLine().split(" ");
            Stack<Character> stack = new Stack<>();

            for (char s : input[1].toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == s) {
                    stack.pop();
                    continue;
                }

                stack.push(s);
            }

            System.out.printf("#%d ", i + 1);
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            System.out.println(sb.reverse());
        }


    }
}