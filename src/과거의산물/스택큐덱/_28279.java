package 과거의산물.스택큐덱;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class _28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (Integer.parseInt(input[0])) {
                case 1: // 덱의 앞에 넣기
                    int num = Integer.parseInt(input[1]);
                    deque.addFirst(num);
                    break;
                case 2: // 덱의 뒤에 넣기
                    num = Integer.parseInt(input[1]);
                    deque.addLast(num);
                    break;
                case 3: // 맨 앞정수가 있으면 출력 없으면 -1
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.pollFirst());
                    }
                    sb.append("\n");
                    break;
                case 4: // 맨 뒤 정수를 빼고 출력 없으면 -1
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.pollLast());
                    }
                    sb.append('\n');
                    break;
                case 5: // 덱에 크기
                    sb.append(deque.size()).append("\n");
                    break;
                case 6: // 덱이 비어있는지 확인
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 7: // 맨 앞 정수 출력 없으면 -1
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekFirst());
                    }
                    sb.append("\n");
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekLast());
                    }
                    sb.append("\n");
                    break;
            }

        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();

    }
}