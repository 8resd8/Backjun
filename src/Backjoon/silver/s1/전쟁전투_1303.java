package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/1303

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전쟁전투_1303 {
    static int N, M, W, B, max, count;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        M = Integer.parseInt(input[0]); // 세로
        N = Integer.parseInt(input[1]); // 가로
        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    max = 0;
                    count = 1;
                    visited[i][j] = true;

                    dfs(map[i][j], i, j);
                    if (map[i][j] == 'W') {
                        W += max * max;
                    } else {
                        B += max * max;
                    }

                }
            }
        }
        System.out.println(W + " " + B);
    }

    private static void dfs(char w, int x, int y) {
        max = Math.max(max, count);

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny] || map[nx][ny] != w) continue;
            count++;
            visited[nx][ny] = true;
            dfs(w, nx, ny);
        }
    }
}