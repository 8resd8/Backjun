package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/21938

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 영상처리_21938 {
    static int N, M, T, count;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        // 1. 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += Integer.parseInt(st.nextToken());
                }
                map[i][j] = sum / 3;
            }
        }
        T = Integer.parseInt(br.readLine());

        // 2. T >= 값에 따라 255, 0 정하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] >= T) map[i][j] = 255;
                else map[i][j] = 0;
            }
        }

        // 3. DFS 시작
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0 || visited[i][j]) continue;
                dfs(i, j);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
            if (map[nx][ny] == 0 || visited[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
}
