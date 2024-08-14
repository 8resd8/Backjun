package 과거의산물.other;

import java.io.*;
import java.util.Stack;

public class _1406_2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            left.push(string.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            String[] order = br.readLine().split(" ");
            char orderC = order[0].charAt(0);

            switch (orderC) {
                case 'L':
                    if (!left.isEmpty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.isEmpty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.isEmpty()) left.pop();
                    break;
                case 'P':
                    left.push(order[1].charAt(0));
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while (!right.isEmpty()) {
            bw.write(right.pop());
        }
        bw.write("\n");

        bw.flush();
        bw.close();
        br.close();

    }
}