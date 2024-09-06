package 입출력과사칙연산.src.Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// https://www.acmicpc.net/problem/4179

public class 불_4179 {
    static int N, M, answer;
    static int[] dy = {0, 0, -1, 1}; // 상 하 좌 우
    static int[] dx = {-1, 1, 0, 0};
    static char[][] map;
    static int[][] fire, jiHun, visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        fire = new int[N][M];
        jiHun = new int[N][M];
        visited = new int[N][M];
//        go = new int[N][M];
        map = new char[N][M];
        answer = -1;
        Queue<int[]> fire = new ArrayDeque<>();
        Queue<int[]> jihun = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], -1);
//            Arrays.fill(go[i], -1);
        }

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j);
                if (map[i][j] == 'F') {
                    fire.add(new int[]{i, j});
                    visited[i][j] = 0;
                } else if (map[i][j] == 'J') {
                    jihun.add(new int[]{i, j});
                    visited[i][j] = 0;
//                    go[i][j] = 0;

                }
            }
        }

        fireBfs(fire);
        jihunBfs(jihun);

//        for (int[] ints : visited) {
//            System.out.println(Arrays.toString(ints));
//        }
//        System.out.println();
//
//        for (int[] ints : go) {
//            System.out.println(Arrays.toString(ints));
//        }


        System.out.println(answer == -1 ? "IMPOSSIBLE" : answer);
    }

    private static void jihunBfs(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            // 벽에 도착 && -1아니면 탈출
            if (map[x][y] != '#' && (x == 0 || y == 0 || x == N - 1 || y == M - 1)) {
                answer = visited[x][y] + 1;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (map[nx][ny] != '.') continue;

                if (visited[nx][ny] == -1 || visited[x][y] + 1 < visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }
        }
    }

    private static void fireBfs(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (map[nx][ny] != '.' || visited[nx][ny] != -1) continue;

                queue.add(new int[]{nx, ny});
                visited[nx][ny] = visited[x][y] + 1;
            }
        }
    }
}