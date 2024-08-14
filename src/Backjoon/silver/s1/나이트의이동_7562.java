package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/7562

public class 나이트의이동_7562 {
    static int[][] map;
    static int[][] visited;
    static int n;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; // 왼쪽 위부터 시계방향
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            visited = new int[n][n];
            for (int j = 0; j < n; j++) {
                Arrays.fill(visited[j], -1);
            }

            int[] current = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] want = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(bfs(current, want));
        }
    }

    private static int bfs(int[] current, int[] want) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(current);
        visited[current[0]][current[1]] = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            if (x == want[0] && y == want[1]) return visited[x][y];

            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isValid(nx, ny) && visited[nx][ny] == -1) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }

        }

        return -1;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}
