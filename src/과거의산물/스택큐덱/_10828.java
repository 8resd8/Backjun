package 과거의산물.스택큐덱;

import java.io.*;
import java.util.Stack;

public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    int num = Integer.parseInt(input[1]);
                    stack.push(num);
                    break;
                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop());
                    break;
                case "size":
                    sb.append(stack.size());
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek());
                    break;
            }
            if (!input[0].equals("push")) {
                sb.append("\n");
            }
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();

    }
}