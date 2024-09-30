package 입출력과사칙연산.src.Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 다리만들기_2146 {
    static int N, name, minLength;
    static int[][] map;
    static boolean[][] setName, visited;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        name = 1;
        minLength = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    setName(i, j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) {
                    bfs(i, j, map[i][j]);
                }
            }
        }

        System.out.println(minLength - 1);
    }

    private static void bfs(int i, int j, int value) {
        Queue<int[]> queue = new ArrayDeque<>();
        visited = new boolean[N][N];
        queue.add(new int[]{i, j, 0});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (map[x][y] != 0 && map[x][y] != value) { // 섬과 닿은 경우
                minLength = Math.min(minLength, dist);
            }

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (visited[nx][ny] || map[nx][ny] == value) continue;

                if (minLength > dist + 1) {
                    queue.add(new int[]{nx, ny, dist + 1});
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private static void setName(int i, int j) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{i, j});
        setName = new boolean[N][N];
        map[i][j] = name;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (setName[nx][ny] || map[nx][ny] == 0) continue;
                queue.add(new int[]{nx, ny});
                setName[nx][ny] = true;
                map[nx][ny] = name;
            }
        }
        name++;
    }
}