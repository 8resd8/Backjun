package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/16948

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 데스나이트_16948 {
    static int n;
    static boolean[][] map;
    static int[] dx = {-2, -2, 0, 0, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new boolean[n][n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());

        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());


        System.out.println(bfs(r1, c1, r2, c2));
    }

    private static int bfs(int a, int b, int tx, int ty) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, b, 0});
        map[a][b] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];

            if (x == tx && y == ty) return count;

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || map[nx][ny]) continue;
                q.add(new int[]{nx, ny, count + 1});
                map[nx][ny] = true;
            }
        }

        return -1;
    }
}