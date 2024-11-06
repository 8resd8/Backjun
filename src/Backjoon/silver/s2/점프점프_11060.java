package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/11060

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 점프점프_11060 {
    static int N;
    static int[] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N + 1];
        visited = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{1, 0}); // 현재, 카운트
        visited[1] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int now = cur[0];
            int count = cur[1];;
            int jump = now + map[cur[0]];

            if (now >= N) return count;


            for (int i = now; i <= jump && i <= N; i++) {
                if (visited[i]) continue;
                visited[i] = true;
                q.add(new int[]{i, count + 1});

            }
        }

        return -1;
    }
}
