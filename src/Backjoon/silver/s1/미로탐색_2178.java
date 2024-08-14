package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 미로탐색_2178 {
    static int[][] map;
    static int[][] visited;
    static int N;
    static int M;
    static int[] dx = {0, 0, -1, 1}; // 상 하 좌 우
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = input[0] + 1;
        M = input[1] + 1;
        visited = new int[N][M];
        map = new int[N][M];

        for (int i = 1; i < N; i++) {
            String line = br.readLine();
            for (int j = 1; j < M; j++) {
                int num = Integer.parseInt(String.valueOf(line.charAt(j - 1)));
                map[i][j] = num;
            }
        }

        bfs(1, 1);
        System.out.println(visited[N - 1][M - 1]);
    }

    public static void bfs(int a, int b) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b});
        visited[a][b] = 1;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0];
            int y = arr[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isValid(nx, ny) && visited[nx][ny] == 0 && map[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }
        }
    }


    private static boolean isValid(int x, int y) {
        return x >= 1 && y >= 1 && x < N && y < M;
    }
}
