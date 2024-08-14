package 과거의산물.스택큐덱;

import java.io.*;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                count -= stack.peek();
                stack.pop();
            } else {
                count += num;
                stack.push(num);
            }
        }
        System.out.println(count);

    }
}