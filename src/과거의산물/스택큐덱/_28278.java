package 과거의산물.스택큐덱;

import java.io.*;
import java.util.Stack;

public class _28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (Integer.parseInt(input[0])) {
                case 1: // 1. Push 값 넣기
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case 2: // 2. Pop 값 꺼내기
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.pop());
                    }
                    break;
                case 3: // 3. Size 크기 확인
                    sb.append(stack.size());
                    break;
                case 4: // 4. Empty 비어있는지 확인
                    if (stack.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    break;
                default: // 5. Peek 최상단값 확인
                    if (stack.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.peek());
                    }
                    break;
            }
            if (Integer.parseInt(input[0]) != 1) {
                sb.append("\n");
            }

        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();

    }
}