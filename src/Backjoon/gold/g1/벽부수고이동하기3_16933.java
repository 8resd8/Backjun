package Backjoon.gold.g1;


/**
    https://www.acmicpc.net/problem/16933
    낮, 밤의 상태를 각각 따로 저장시켜야했다.
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class 벽부수고이동하기3_16933 {
    static int N, M, K;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]); // 부술 수 있는 기회
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0)); // (1, 1) -> (N, M) 이동
    }

    private static int bfs(int a, int b) {
        boolean[][][] visited = new boolean[N][M][K + 1]; // 1 ~ K사용
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, b, 1, K, 1}); // 좌표(a, b), count, K, 1 = 낮
        visited[a][b][K] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];
            int k = cur[3];
            int night = cur[4];

            if (x == N - 1 && y == M - 1) {
                return count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (visited[nx][ny][k] || (k == 0 && map[nx][ny] == 1)) continue;

                // 부술 수 있고 밤이 아니면 부시고 이동
                if (k > 0 && map[nx][ny] == 1 && night == 1) {
                    q.add(new int[]{nx, ny, count + 1, k - 1, 0}); // 다음은 밤
                    visited[nx][ny][k] = true;
                    // 부실 수 있고 밤이면 가만히 있기 (카운트는 증가)
                } else if (k > 0 && map[nx][ny] == 1 && night == 0) {
                    q.add(new int[]{x, y, count + 1, k, 1}); // 다음은 낮
                } else {
                    q.add(new int[]{nx, ny, count + 1, k, night == 1 ? 0 : 1});
                    visited[nx][ny][k] = true;
                }
            }
        }
        return -1;
    }
}
/*
7 5 1
00000
11110
00000
01111
00000
11111
11110
ans: 19

4 4 2
0101
0110
1001
0010
ans: 8
* */