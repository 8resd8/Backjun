package 입출력과사칙연산.src.Backjoon.gold.g3;

// https://www.acmicpc.net/problem/14442

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class 벽부수고이동하기2_14442 {
    static int N, M, K;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]); // K개 이동하기
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][][] visited = new boolean[N][M][11]; // 1 ~ 10
        q.add(new int[]{0, 0, K, 1});
        visited[0][0][K] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int k = cur[2]; // 벽을 부수는 기회

            if (x == N - 1 && y == M - 1) {
                return cur[3];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (visited[nx][ny][k] || (k == 0 && map[nx][ny] == 1)) continue;

                if (k > 0 && map[nx][ny] == 1) {
                    q.add(new int[]{nx, ny, k - 1, cur[3] + 1});
                } else {
                    q.add(new int[]{nx, ny, k, cur[3] + 1});
                }

                visited[nx][ny][k] = true;
            }

        }

        return -1;
    }
}
