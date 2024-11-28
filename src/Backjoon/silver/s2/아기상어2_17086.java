package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/17086

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 아기상어2_17086 {
    static int N, M, max;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0}; // 왼쪽 위부터 시계방향
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        // 0 -> 1 만나는 거리
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    visited = new boolean[N][M];
                    bfs(i, j);
                }
            }
        }

        System.out.println(max);
    }

    public static void bfs(int a, int b) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, b, 0});
        visited[a][b] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];

            if (map[x][y] == 1) {
                max = Math.max(max, count);
                return;
            }

            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny]) continue;
                q.add(new int[]{nx, ny, count + 1});
                visited[nx][ny] = true;
            }
        }
    }
}
