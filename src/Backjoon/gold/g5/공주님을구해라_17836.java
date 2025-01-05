package Backjoon.gold.g5;

// https://www.acmicpc.net/problem/17836

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 공주님을구해라_17836 {
    static int N, M, T;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = bfs();

        if (result == 0) System.out.println("Fail");
        else System.out.println(result);
    }

    private static int bfs() {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0, 0, 0}); // x, y, 시간, 검 보유 여부(0, 1)
        visited[0][0][0] = true;
        int time = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];
            int haveKnife = cur[3];

            if (x == N - 1 && y == M - 1 && count <= T) {
                time = Math.min(time, count);
            }


            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (haveKnife == 0 && map[nx][ny] == 1) continue;

                if (haveKnife == 1 && !visited[nx][ny][1]) { // 칼이 있으면 어디든 갈 수 있음.
                    q.add(new int[]{nx, ny, count + 1, 1});
                    visited[nx][ny][1] = true;

                } else if (haveKnife == 0 && map[nx][ny] != 1 && !visited[nx][ny][0]) { // 칼이 없으면 벽이 아닌 곳만 갈 수 있음.
                    // 검이 없었는데 찾은 경우 검 오우너가 된다.
                    if (map[nx][ny] == 2) {
                        q.add(new int[]{nx, ny, count + 1, 1});
                        visited[nx][ny][1] = true;
                    } else {
                        q.add(new int[]{nx, ny, count + 1, 0});
                        visited[nx][ny][0] = true;
                    }
                }
            }
        }

        return time == Integer.MAX_VALUE ? 0 : time;
    }
}
