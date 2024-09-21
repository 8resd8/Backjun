package Backjoon.gold.g4;

// https://www.acmicpc.net/problem/9663

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen_9663 {
    static int answer, count, N;
    public static void main(String[] args) throws IOException {
//        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        N = 4;

        nQueen(0);
        // 놓은 위치의 가로
        // 놓은 위치의 세로
        // 놓은 위치의 대각선
        System.out.println(answer);

    }

    private static void nQueen(int i) {
        if (count == N) {
            answer++;
            return;
        }
        count++;
//        System.out.printf("(%d, %d) 기준 count: %d\n\n", i, j, count);
        for (int k = i; k < N; k++) {
            if (check(k)) {
                nQueen(k + 1);
            }
        }
    }

    private static boolean check(int i) {
        for (int j = 0; j < N; j++) {
            if (j == i) continue;
            if (true);
        }

        return true;
    }
}