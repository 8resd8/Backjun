package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/21736

public class 헌내기는친구가필요해_21736 {
    static int N, M, helloPeople;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        map = new char[N][M];
        int[] start = new int[2];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = input.charAt(j);
                if (map[i][j] == 'I') { // 출발 지점 선택
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        dfs(start[0], start[1]);
        System.out.println(helloPeople == 0 ? "TT" : helloPeople);
    }

    private static void dfs(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= M || map[x][y] == 'X') return;

        if (map[x][y] == 'P') helloPeople++;

        map[x][y] = 'X';

        for (int i = 0; i < 4; i++) {
            dfs(x + dx[i], y + dy[i]);
        }
    }
}
