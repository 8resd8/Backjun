package 입출력과사칙연산.src.Backjoon.silver.s1;

// https://www.acmicpc.net/problem/5014

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 스타트링크_5014 {
    static int[] dx;
    static int[] map;
    static int F, S, G, U, D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken()); // 전체 층
        S = Integer.parseInt(st.nextToken()); // 현재 층
        G = Integer.parseInt(st.nextToken()); // 목표
        U = Integer.parseInt(st.nextToken()); // 위로
        D = Integer.parseInt(st.nextToken()); // 아래로
        map = new int[F + 1];
        dx = new int[]{U, -D};


        int answer = bfs();
        System.out.println(answer == -1 ? "use the stairs" : answer);
    }

    private static int bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[] visited = new boolean[F + 1];
        q.add(new int[]{S, 0});
        visited[S] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            if (cur[0] == G) {
                return cur[1];
            }

            for (int i = 0; i < 2; i++) {
                int next = cur[0] + dx[i];

                if (next < 1 || next > F || visited[next]) continue;

                q.add(new int[]{next, cur[1] + 1});
                visited[next] = true;
            }
        }

        return -1;
    }
}