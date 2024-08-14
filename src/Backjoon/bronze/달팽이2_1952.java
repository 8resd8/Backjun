package Backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1952

public class 달팽이2_1952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        int M = Integer.parseInt(nm[0]); // 세로
        int N = Integer.parseInt(nm[1]); // 가로
        int[][] map = new int[M][N];

        int[] dy = {1, 0, -1, 0};  // 오른쪽, 아래, 왼쪽, 위
        int[] dx = {0, 1, 0, -1};  // 오른쪽, 아래, 왼쪽, 위

        int x = 0, y = 0;
        int direction = 0;
        int turnCount = 0;

        for (int i = 0; i < M * N - 1; i++) {
            map[x][y] = 1;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= M || ny < 0 || ny >= N || map[nx][ny] == 1) {
                direction = (direction + 1) % 4;
                turnCount++;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }

            x = nx;
            y = ny;
        }

        System.out.println(turnCount);
    }
}