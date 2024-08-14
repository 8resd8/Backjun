package 과거의산물.스택큐덱;

import java.io.*;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            Stack<Character> statement = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[') {
                    statement.push(c);
                } else if (c == ')') {
                    if (statement.isEmpty() || statement.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    statement.pop();
                } else if (c == ']') {
                    if (statement.isEmpty() || statement.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    statement.pop();
                }
            }

            if (statement.isEmpty() && isBalanced) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }


        }
        bw.flush();
        bw.close();
        br.close();
    }
}