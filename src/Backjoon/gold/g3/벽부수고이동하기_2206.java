package Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class 벽부수고이동하기_2206 {
    static int N, M;
    static int[][] map;
    static int[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        map = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(input[j - 1]);
            }
        }

        bfs();
    }

    public static void bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        visited = new int[N + 1][M + 1];
        q.add(new int[]{1, 1});
        visited[1][1] = 1;
        boolean pass = true;
        // 벽은 1개 부술 수 있다

        // visited에 확인을 해서 부술 수 있으면 부수고 지나가고 없으면 안간다

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == N && y == M) {
                System.out.println(visited[x][y]);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (visited[nx][ny] != 0) continue;

                if (map[nx][ny] == 1 && pass) {
                    pass = false;
                    q.add(new int[]{nx, ny});
                } else if (map[nx][ny] == 0) {
                    q.add(new int[]{nx, ny});
                }
                visited[nx][ny] = visited[x][y] + 1;

            }
        }
    }
}
