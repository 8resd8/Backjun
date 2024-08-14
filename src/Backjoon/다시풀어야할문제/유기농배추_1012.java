package Backjoon.다시풀어야할문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 유기농배추_1012 {
    static int[][] farm;
    static boolean[][] visited;
    static int N, M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 배추밭의 가로 길이
            N = Integer.parseInt(st.nextToken()); // 배추밭의 세로 길이
            int K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치의 개수

            farm = new int[M][N];
            visited = new boolean[M][N];

            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[x][y] = 1;
            }

            int wormCount = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    //
                    if (farm[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        wormCount++;
                    }
                }
            }
            System.out.println(wormCount);

        }


    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y}); //00 01 02 ...
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) { // 범위 체크
                    if (farm[nx][ny] == 1 && !visited[nx][ny]) { // 1이고 방문 안했다면.
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}