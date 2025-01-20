package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/30468

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 호반우가학교에지각한이유1_30468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        int N = Integer.parseInt(st.nextToken()) * 4;
        System.out.println(Math.max(N - sum, 0));
    }
}
