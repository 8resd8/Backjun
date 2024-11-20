package Backjoon.gold.g4;

// https://www.acmicpc.net/problem/2573

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class 빙산_2573 {
    static int n, m;
    static int[][] map;
    static boolean[][] visited, ffVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int count = 0;
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                count += map[i][j];
            }
            max = Math.max(max, count);
        }

        for (int year = 1; year <= max; year++) {
            // 1. 상하좌우 녹이기
            visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 0) continue;
                    melt(i, j);
                }
            }

            // 2. 덩어리 개수 확인
            ffVisited = new boolean[n][m];
            int iceCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (ffVisited[i][j] || map[i][j] == 0) continue;
                    floodFill(i, j);
                    iceCount++;
                }
            }

            if (iceCount >= 2) {
                System.out.println(year);
                return;
            }
        }


        System.out.println(0);
    }

    private static void melt(int x, int y) {
        visited[x][y] = true;

        // 상하좌우가 0인 경우만 녹인다
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny]) continue;
            if (map[nx][ny] != 0 || map[x][y] == 0) continue;
            map[x][y]--;
        }
    }

    private static void floodFill(int a, int b) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, b});
        ffVisited[a][b] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || ffVisited[nx][ny]) continue;
                if (map[nx][ny] == 0) continue;

                q.add(new int[]{nx, ny});
                ffVisited[nx][ny] = true;
            }
        }

    }
}