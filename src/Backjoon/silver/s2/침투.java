package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/13565

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 침투 {
    static int N, M;
    static boolean[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static String answer = "NO";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = NM[0];
        M = NM[1];
        map = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) == '0'; // true -> 지나갈 수 있음
            }
        }

        for (int i = 0; i < M; i++) {
            if (map[0][i]) dfs(0, i);
        }

        System.out.println(answer);
    }

    private static void dfs(int x, int y) {
        map[x][y] = false;

        if (x == N - 1 || answer.equals("YES")) {
            answer = "YES";
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M || !map[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
}
