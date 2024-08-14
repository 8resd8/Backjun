package Backjoon.gold;


// https://www.acmicpc.net/problem/10026

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 적록생약_10026 {
    static int[][] map;
    static int[][] visited;
    static int N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        // R = 1, G = 2, B = 3
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                if (input.charAt(j) == 'R') map[i][j] = 1;
                else if (input.charAt(j) == 'G') map[i][j] = 2;
                else map[i][j] = 3;
            }
        }

        // 정상인
        int normal = 0;
        int unique = 0;
        for (int i = 1; i <= 3; i++) {
            visited = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][k] == i && visited[j][k] == 0) {
                        bfs(j, k, i);
                        normal++;

                        // 적록생약도 파랑은 정상으로 본다.
                        if (i == 2) {
                            unique++;
                        }
                    }
                }
            }
        }
        System.out.println("normal = " + normal);

        // 적록생약1, 3을 같은것으로 본다
        visited = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 플래그 세워서 1, 3일때만 조건에서 통과시켜주면 될듯
            }
        }

    }

    private static void bfs(int j, int k, int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{j, k});
        visited[j][k] = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isVaild(nx, ny) && visited[nx][ny] == 0 && map[nx][ny] == target) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = 1;
                }
            }
        }
    }

    private static boolean isVaild(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < N && ny < N;
    }
}
