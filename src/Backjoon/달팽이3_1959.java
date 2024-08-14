package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1959

public class 달팽이3_1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] mn = br.readLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int[][] map = new int[m][n];
        int x = 0, y = 0;
        int[] dx = {1, 0, -1, 0}; // 오른 아래 왼 위
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < m * n; i++) {
            map[x][y] = 1;

            // 인덱스 범위 초과 또는 값이 있다면 회전해야겠지?

        }
    }
}