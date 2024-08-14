package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// https://www.acmicpc.net/problem/7576

public class 토마토_7576 {
    static int[] dx = {0, 0, -1, 1}; // 상 하 좌 우, 위 아래
    static int[] dy = {1, -1, 0, 0}; // 상 하 좌 우, 위 아래

    static int[][] map;
    static int[][] visited;
    static int N;
    static int M;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = input[1];
        M = input[0];
        map = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                int number = Integer.parseInt(s[j]);
                map[i][j] = number;
                if (number == 1) { // 익은 토마토(시작 위치)를 먼저 넣기
                    queue.add(new int[]{i, j});
                    visited[i][j] = 1;
                } else if (number == -1) {
                    visited[i][j] = -1;
                }

            }
        }

        bfs();
        int answer = -1;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                // 익지 않은 토마토가 존재한 경우
                if (visited[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                answer = Math.max(answer, visited[i][j] - 1);
            }
        }

        System.out.println(answer);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isValid(nx, ny) && visited[nx][ny] == 0 && map[nx][ny] != -1) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }

        }
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }
}