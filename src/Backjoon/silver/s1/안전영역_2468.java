package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/2468

public class 안전영역_2468 {
    static int[][] map;
    static int[][] visited;
    static int N;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int maxLength = 0;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(input[j]);
                maxLength = Math.max(maxLength, map[i][j]);
            }
        }


        int count = 0;
        for (int water = 0; water <= maxLength; water++) { // 높이는 1이상 100이하
            visited = new int[N][N]; // 방문 배열 초기화
            int nowCount = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] > water && visited[i][j] == 0) {
                        visited[i][j] = 0; // 회색 영역
                        bfs(i, j, water);
                        nowCount++;
                    }
                }
            }
            count = Math.max(count, nowCount);
        }


        System.out.println(count);
    }

    private static void bfs(int x, int y, int water) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 1;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int a = poll[0];
            int b = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && visited[nx][ny] == 0 && map[nx][ny] > water) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = 1;
                }
            }

        }
    }
}