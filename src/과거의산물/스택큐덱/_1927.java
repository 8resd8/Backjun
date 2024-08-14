package 과거의산물.스택큐덱;

import java.io.*;
import java.util.*;

public class _1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            // input이 0이면 가장 작은 값 출력 and 배열에서 제거
            if (input == 0) {
                if (!priorityQueue.isEmpty()) {
                    sb.append(priorityQueue.poll()).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
                continue;
            }
            // 0이 아니면 값을 추가
            priorityQueue.add(input);
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}