package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/4963

public class 섬의개수_4963 {
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};// 좌측 상단부터 시계방향
    static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
    static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] nm = br.readLine().split(" ");
            // 0이 가로 1이 세로
            w = Integer.parseInt(nm[0]);
            h = Integer.parseInt(nm[1]);

            if (w == 0 && h == 0) {
                return;
            }
            int[][] map = new int[h][w];
            int[][] visited = new int[h][w];
            
            for (int i = 0; i < h; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(input[j]);
                }
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && visited[i][j] == 0) { // 땅인 경우 확인
                        bfs(map, i, j, visited);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int[][] map, int i, int j, int[][] visited) {
        Queue<int[]> queue =  new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = 1;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0];
            int y = arr[1];

            for (int k = 0; k < 8; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
                if (map[nx][ny] != 1 || visited[nx][ny] != 0) continue;
                queue.add(new int[]{nx, ny});
                visited[nx][ny] = 1;
            }
        }


    }
}
