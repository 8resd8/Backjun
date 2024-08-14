package 과거의산물.스택큐덱;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2346 {

    static class NumberValue {
        int number;
        int value;

        public NumberValue(int number, int value) {
            this.number = number;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        Deque<NumberValue> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            deque.add(new NumberValue(i + 1, num));
        }

        while (!deque.isEmpty()) {
            sb.append(deque.peek().number).append(" "); // 번호

            int next = deque.poll().value; // 종이 값

            if (deque.isEmpty()) {
                break;
            }

            if (next > 0) {
                for (int i = 0; i < next - 1; i++) { // 맨 앞에 값은 제거하므로 1번 적은횟수
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(next); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}