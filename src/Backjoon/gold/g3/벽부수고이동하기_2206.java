package 입출력과사칙연산.src.Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 벽부수고이동하기_2206 {
    static int N, M;
    static int[][] map;
    static int[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        bfs();
        int value = Math.max(visited[N - 1][M - 1][1], visited[N - 1][M - 1][0]);
        System.out.println(value == 0 ? -1 : value);
    }

    public static void bfs() {
        Deque<int[]> q = new ArrayDeque<>();
        visited = new int[N][M][2];
        q.add(new int[]{0, 0, 0});
        visited[0][0][0] = 1; // 벽을 부수지 않고 진입
        visited[0][0][1] = 1; // 벽을 부수고 진입

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == N - 1 && y == M - 1) {
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                // 벽을 부숴서 진행, 벽을 부순 세상에 들어가야해
                if (cur[2] == 0 && map[nx][ny] == 1 && visited[nx][ny][1] == 0) {
                    q.add(new int[]{nx, ny, 1});
                    visited[nx][ny][1] = visited[x][y][0] + 1;

                } else if(map[nx][ny] == 0 && visited[nx][ny][cur[2]] == 0) {
                    q.add(new int[]{nx, ny, cur[2]});
                    visited[nx][ny][cur[2]] = visited[x][y][cur[2]] + 1;
                }

            }
        }
    }
}