package Backjoon.bronze;

// https://www.acmicpc.net/problem/1236

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 성지키기_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        int mCount = 0; // ㅡ
        int lCount = 0; // ㅣ
        for (int i = 0; i < N; i++) {
            boolean m = true;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    m = false;
                    break;
                }
            }
            if (m) mCount++;
        }

        for (int i = 0; i < M; i++) {
            boolean l = true;
            for (int j = 0; j < N; j++) {
                if (map[j][i] == 'X') {
                    l = false;
                    break;
                }
            }
            if (l) lCount++;
        }

        System.out.println(Math.max(mCount, lCount));
    }
}