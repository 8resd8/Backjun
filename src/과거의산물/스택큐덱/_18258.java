package 과거의산물.스택큐덱;

import java.io.*;
import java.util.LinkedList;

public class _18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int pushNum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    pushNum = Integer.parseInt(input[1]);
                    queue.offer(pushNum);
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.poll()).append('\n');
                    }
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.peek()).append('\n');
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.peekLast()).append('\n');
                    }
                    break;
            }

        }
        System.out.println(sb);
        br.close();

    }
}
