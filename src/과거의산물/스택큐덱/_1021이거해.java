package 과거의산물.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1021

public class _1021이거해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int[] positions = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }

        int moveCount = 0;
        for (int position : positions) {
            int idx = queue.indexOf(position);
            int leftMove = idx;
            int rightMove = queue.size() - idx;
            moveCount += Math.min(leftMove, rightMove);

            while (queue.peek() != position) {
                if (leftMove <= rightMove) {
                    queue.offerLast(queue.pollFirst());
                } else {
                    queue.offerFirst(queue.pollLast());
                }
            }
            queue.poll(); // 원소 뽑아내기
        }

        System.out.println(moveCount);



    }
}