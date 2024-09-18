package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 미로만들기_2665 {
    static int N;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(input[j]);
            }
        }

        System.out.println(dijkstra());
    }

    private static int dijkstra() {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0, 0}); // x, y, count
        boolean[][] visited = new boolean[N][N];
        visited[0][0] = true;

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == N - 1 && y == N - 1) {
                return cur[2];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny]) continue;

                if (map[nx][ny] == 0) { // 검정방은 횟수를 늘려서 제일 뒤 추가
                    deque.addLast(new int[]{nx, ny, cur[2] + 1});
                } else if (map[nx][ny] == 1) {
                    deque.addFirst(new int[]{nx, ny, cur[2]}); // 흰방은 그대로 추가, 제일 앞 추가
                }
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
}