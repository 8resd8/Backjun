package 과거의산물.스택큐덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class _2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(i + 1);
        }

        while (!q.isEmpty()) {
            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            }
            // 1. 제일 위 버리기
            q.remove();
            // 제일 위를 제거 후 아래로 옮기기
            q.offer(q.poll());
        }


    }
}