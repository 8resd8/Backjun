package 과거의산물.스택큐덱;

import java.io.*;
import java.util.LinkedList;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push" :
                    queue.offer(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1" : queue.pollFirst()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
                    break;
                default:
                    sb.append(queue.isEmpty() ? "-1" : queue.peekLast()).append("\n");
                    break;
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();

    }
}