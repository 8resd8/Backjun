package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토_7569 {
    // 위, 아래, 왼쪽, 오른쪽, 앞, 뒤
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {0, 0, 0, 0, 1, -1};
    static int[] dz = {1, -1, 0, 0, 0, 0};
    static int x, y, z;
    static int[][][] tomato;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        tomato = new int[H][N][M];

        Queue<int[]> queue = new LinkedList<>();

        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(in.readLine());
                for (int j = 0; j < M; j++) {
                    tomato[h][i][j] = Integer.parseInt(st.nextToken());
                    if (tomato[h][i][j] == 1) {
                        queue.add(new int[]{j, i, h});
                    }
                }
            }
        }

        // 모두 다 익어있는 경우
        if (queue.size() == M * N * H) {
            System.out.println(0);
            return;
        }

        // BFS
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            x = temp[0];
            y = temp[1];
            z = temp[2];

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx < 0 || ny < 0 || nz < 0 || nx >= M || ny >= N || nz >= H) {
                    continue;
                }


                if (tomato[nz][ny][nx] == 0) {
                    tomato[nz][ny][nx] = tomato[z][y][x] + 1;
                    queue.add(new int[]{nx, ny, nz});
                }
            }
        }

        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    // 0인 경우
                    if (tomato[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }

                    if (max < tomato[i][j][k]) {
                        max = tomato[i][j][k];
                    }
                }
            }
        }

        System.out.println(max - 1);
    }
}