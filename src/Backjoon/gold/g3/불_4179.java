package Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/4179

public class 불_4179 {
    static String[] map;
    static int[][] fireTime;
    static int[][] jiHun;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        fireTime = new int[N][M];
        jiHun = new int[N][M];
        map = new String[N];

        // 초기값 -1
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
            Arrays.fill(fireTime[i], -1);
            Arrays.fill(jiHun[i], -1);
        }

        Queue<int[]> fire = new LinkedList<>();
        Queue<int[]> hun = new LinkedList<>();

        // 불, 지훈이 초기 위치 설정 (방문 = 0)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i].charAt(j) == 'F') {
                    fire.add(new int[]{i, j});
                    fireTime[i][j] = 0;
                } else if (map[i].charAt(j) == 'J') {
                    hun.add(new int[]{i, j});
                    jiHun[i][j] = 0;
                }

            }
        }

        fireBfs(fire); // 불의 이동 시간 먼저 확인
        jiHunBfs(hun); // 지훈이는 벽을 피하면서 불이타지 않은 곳으로 나가야한다
    }

    private static void fireBfs(Queue<int[]> fire) {
        while (!fire.isEmpty()) {
            int[] now = fire.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (fireTime[nx][ny] >= 0 || map[nx].charAt(ny) == '#') continue;
                fire.add(new int[]{nx, ny});
                fireTime[nx][ny] = fireTime[x][y] + 1;
            }
        }
    }

    private static void jiHunBfs(Queue<int[]> hun) {
        while (!hun.isEmpty()) {
            int[] now = hun.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 지훈이가 탈출에 성공한 경우 (범위 이탈의 경우)
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    System.out.println(jiHun[x][y] + 1);
                    return;
                }

                if (jiHun[nx][ny] >= 0 || map[nx].charAt(ny) == '#') continue;
                if (fireTime[nx][ny] >= 0 && jiHun[x][y] + 1 >= fireTime[nx][ny]) continue; // 불이 지나가지 않은곳 && 다음 자리에서 불과 만나면 경우

                jiHun[nx][ny] = jiHun[x][y] + 1;
                hun.add(new int[]{nx, ny});
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}