package Backjoon.silver.s3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1051

public class 숫자정사각형_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] map = new int[n][m];

        // 입력
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        System.out.println(getMaxSquare(n, m, map));
    }

    private static int getMaxSquare(int n, int m, int[][] map) {
        int maxSquare = 0; // 정사각형의 크기

        for (int x = 0; x < n; x++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 범위값 초과 체크
                    if (j + x < 0 || j + x >= m || i + x < 0 || i + x >= n) continue;

                    int one = map[i][j];          // 좌 상단, 꼭지점 시작
                    int two = map[i][j + x];      // 우 상단
                    int three = map[i + x][j];    // 좌 하단
                    int four = map[i + x][j + x]; // 우 하단

                    // 모든 값이 같은 경우
                    if ((one == two) && (one == three) && (one == four)) {
                        maxSquare = Math.max(maxSquare, (x + 1) * (x + 1));
                    }
                }
            }
        }
        return maxSquare;
    }
}