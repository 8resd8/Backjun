package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/11123

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 양한마리양두마리_11123 {
    static int H, W;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            map = new boolean[H][W];
            visited = new boolean[H][W];

            for (int j = 0; j < H; j++) {
                String input = br.readLine();
                for (int k = 0; k < W; k++) {
                    map[j][k] = input.charAt(k) == '#';
                }
            }

            int count = 0;
            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    if (map[j][k] && !visited[j][k]) {
                        bfs(j, k);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    private static void bfs(int a, int b) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{a, b, 0});
        visited[a][b] = true;
        map[a][b] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= H || ny < 0 || ny >= W || !map[nx][ny] || visited[nx][ny]) continue;
                q.add(new int[]{nx, ny});
                visited[nx][ny] = true;
            }
        }
    }
}
