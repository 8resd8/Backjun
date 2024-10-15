package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/1743

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 음식물피하기_1743 {
    static int N, M, K, maxSize;
    static boolean[][] map, visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 세로
        M = Integer.parseInt(st.nextToken()); // 가로
        K = Integer.parseInt(st.nextToken()); // 쓰레기 개수
        visited = new boolean[N][M];
        map = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            map[x][y] = true; // 쓰레기가 있으면 true
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] && !visited[i][j]) {
                    visited[i][j] = true;
                    maxSize = 1;
                    dfs(i, j);
                    answer = Math.max(answer, maxSize);
                    maxSize = 0;
                }
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int x, int y) {

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= M || !map[nx][ny] || visited[nx][ny]) continue;
            visited[nx][ny] = true;
            dfs(nx, ny);
            maxSize++;
        }
    }
}
/**
3 3 7
1 1
1 2
1 3
2 1
2 2
3 1
3 3
ans: 6

5 5 8
1 1
2 1
3 1
4 1
1 3
2 3
3 3
1 5
ans: 4
 */