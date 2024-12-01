package Backjoon.silver.s3;

// https://www.acmicpc.net/problem/10025

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게으른백곰_10025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[1_000_001]; // 좌표
        int maxN = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken()); // 얼음의 양
            int x = Integer.parseInt(st.nextToken()); // 양동이 좌표
            arr[x] = g;
            maxN = Math.max(maxN, x);
        }


        // 양 옆으로 집을 수 있음. 0 1 2 K 4 5 6
        int maxIce = 0;
        for (int i = 0; i <= Math.min(1000000, K * 2); i++) {
            maxIce += arr[i];
        }

        int sum = maxIce;
        for (int i = K + 1; i <= Math.min(1000000, maxN - K); i++) {
            sum += arr[i + K] - arr[i - K - 1];
            maxIce = Math.max(maxIce, sum);
        }

        System.out.println(maxIce);
    }
}
