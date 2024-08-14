package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 그림_1926 {
    static int[][] map;
    static int[][] visited;
    static int N, M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = nm[0];
        M = nm[1];
        map = new int[N][M];
        visited = new int[N][M];


        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(input[j]);
                visited[i][j] = -1;
            }
        }

        int count = 0;
        int area = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j] == -1) {
                    area = Math.max(area, bfs(i, j));
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(area);
    }

    private static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 0;
        int answer = 0;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int a = arr[0];
            int b = arr[1];
            answer++;

            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] == 0 || visited[nx][ny] == -1) continue;

                queue.add(new int[]{nx, ny});
                visited[nx][ny] = 0;
            }
        }
        return answer;
    }
}