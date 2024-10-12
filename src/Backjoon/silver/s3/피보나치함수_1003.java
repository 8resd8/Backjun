package Backjoon.silver.s3;

// https://www.acmicpc.net/problem/1003

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] count0 = new int[n + 2]; // n == 0이어도 [1]까지는 있어야한다
            int[] count1 = new int[n + 2];

            count0[0] = 1;
            count1[1] = 1;

            for (int j = 2; j <= n; j++) {
                count0[j] = count0[j - 1] + count0[j - 2];
                count1[j] = count1[j - 1] + count1[j - 2];
            }
            sb.append(count0[n]).append(" ").append(count1[n]).append("\n");
        }
        System.out.print(sb);
    }
}