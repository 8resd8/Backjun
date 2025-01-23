package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/16204

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드뽑기_16204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int maxO = Math.min(M, K);
        int maxX = Math.min(N - M, N - K);
        int result = maxO + maxX;

        System.out.println(result);
    }
}
