package Backjoon.silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/16174

public class 점프왕쩰리Small_16173 {
    static int N;
    static int[][] map;
    static String answer = "";
    static boolean flag;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(answer.isEmpty() ? "Hing" : answer);
    }

    private static void dfs(int x, int y) {
        if (flag || visited[x][y]) return;
        visited[x][y] = true;

        if (map[x][y] == -1) {
            answer = "HaruHaru";
            flag = true; // 찾으면 모든 dfs 종료
            return;
        }

        int[] dx = {map[x][y], 0}; // 아래
        int[] dy = {0, map[x][y]}; // 오른쪽

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny)) continue;
            dfs(nx, ny);
        }

        visited[x][y] = false;
    }


    private static boolean isRange(int nx, int ny) {
        return nx < 0 || nx >= N || ny < 0 || ny >= N;
    }
}