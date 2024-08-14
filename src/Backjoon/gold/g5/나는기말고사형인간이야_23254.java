package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

// https://www.acmicpc.net/problem/23254

public class 나는기말고사형인간이야_23254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] Ai = br.readLine().split(" ");
        String[] Bi = br.readLine().split(" ");

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) { // 첫번째 인덱스와 두번째 인덱스 비교
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]); // 오름차순
        });


        int time = nm[0] * 24;
        int answer = 0;
        for (int i = 0; i < nm[1]; i++) {
            int a = Integer.parseInt(Ai[i]);
            int b = Integer.parseInt(Bi[i]);
            pq.offer(new int[]{a, b});

        }

        // 나누지 말고 하나씩 해보자.
        int t = Integer.MAX_VALUE;

        while (time > 0 && !pq.isEmpty()) {
            int[] value = pq.poll();
            int point = value[0];
            int study = value[1];
            t = Math.min(t, (100 - point) / study);
            answer += t * value[0];

            if (point < 100) {
                study = 100 - point;
                pq.add(new int[]{point, study});
            }

            time -= t;
        }
        System.out.println(answer);

    }
}
