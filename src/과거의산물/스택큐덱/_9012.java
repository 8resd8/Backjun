package 과거의산물.스택큐덱;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            stack.clear();

            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty()) {
                    stack.pop();
                } else {
                    stack.push('1');
                    break;
                }
            }
            if (stack.size() > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}