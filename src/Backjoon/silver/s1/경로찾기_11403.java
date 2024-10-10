package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/11403

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 경로찾기_11403 {
    static int n;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // k: 중간 경로
        // i: 출발
        // j: 도착
        // i -> k -> j, 따라서 ik, kj가 1이라면 ij의 경로는 이어진 것
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][k] == 1 && map[k][j] == 1) {
                        map[i][j] = 1; // 기존 맵을 수정하라고 문제 제시
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] a : map) {
            for (int b : a) {
                sb.append(b).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}