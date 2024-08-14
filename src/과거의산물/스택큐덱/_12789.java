package 과거의산물.스택큐덱;

import java.io.*;
import java.util.Stack;

public class _12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> line = new Stack<>();
        Stack<Integer> tempLine = new Stack<>();
        int startNumber = 1;
        String[] input = br.readLine().split(" ");

        // 줄 선대로 스택에 넣기 5 4 1 3 2
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input[n - i - 1]);
            line.push(number);
        }
        StringBuilder sb = new StringBuilder();
        boolean isCheck = true;

        while (!line.isEmpty()) {
            if (startNumber == line.peek()) {
                line.pop();
                startNumber++;
            } else if (!tempLine.isEmpty() && tempLine.peek() == startNumber) {
                tempLine.pop();
                startNumber++;
            } else {
                tempLine.push(line.pop());
            }
        }

        while (!tempLine.isEmpty()) {
            if (tempLine.pop() != startNumber++) {
                isCheck = false;
                break;
            }
        }

        if (isCheck) {
            sb.append("Nice\n");
        } else {
            sb.append("Sad\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();


    }
}