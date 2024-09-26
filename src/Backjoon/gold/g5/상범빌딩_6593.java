package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class 상범빌딩_6593 {
    static int L, R, C;
    static char[][][] map;
    static int[][][] visited;
    static int[] dx = {-1, 1, 0, 0, 0, 0}; // 상 하 좌 우 위 아래
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] input = br.readLine().split(" ");
            L = Integer.parseInt(input[0]);
            R = Integer.parseInt(input[1]);
            C = Integer.parseInt(input[2]);
            if (L == 0 && R == 0 && C == 0) break;

            queue = new ArrayDeque<>();
            visited = new int[L][R][C];
            map = new char[L][R][C];

            for (int i = 0; i < L; i++) {
                for (int j = 0; j < R; j++) {
                    String s = br.readLine();
                    for (int k = 0; k < C; k++) {
                        map[i][j][k] = s.charAt(k);
                        if (map[i][j][k] == 'S') {
                            queue.add(new int[]{i, j, k}); // z x y
                        }
                    }
                }
                br.readLine(); // 빈 칸처리
            }

            int answer = bfs();
            if (answer == -1) sb.append("Trapped!").append("\n");
            else sb.append(String.format("Escaped in %d minute(s).\n", answer));
        }
        System.out.print(sb);
    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int z = cur[0];
            int x = cur[1];
            int y = cur[2];

            if (map[z][x][y] == 'E') {
                return visited[z][x][y];
            }

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C || nz < 0 || nz >= L) continue;
                if (visited[nz][nx][ny] != 0 || map[nz][nx][ny] == '#') continue;
                visited[nz][nx][ny] = visited[z][x][y] + 1;
                queue.add(new int[]{nz, nx, ny});
            }
        }
        return -1;
    }
}