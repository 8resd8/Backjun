package 과거의산물.스택큐덱;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class _10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int num = 0;
            switch (input[0]) {
                case "push_back":
                    num = Integer.parseInt(input[1]);
                    deque.offerLast(num);
                    break;
                case "push_front":
                    num = Integer.parseInt(input[1]);
                    deque.offerFirst(num);
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? "-1" : deque.peek());
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? "-1" : deque.peekLast());
                    break;
                case "pop_front":
                    sb.append(deque.isEmpty() ? "-1" : deque.poll());
                    break;
                case "pop_back":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast());
                    break;
                case "size":
                    sb.append(deque.size());
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? "1" : 0);
                    break;
            }
            if (num == 0) {
                sb.append("\n");
            }

        }
        System.out.println(sb);

    }
}