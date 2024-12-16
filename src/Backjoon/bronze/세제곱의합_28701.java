package Backjoon.bronze;

// https://www.acmicpc.net/problem/28701

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세제곱의합_28701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;

        for (int i = 1; i <= n; i++) {
            a += i;
            b += (i * i * i);
        }
        sb.append(a).append("\n");
        sb.append(a * a).append("\n");
        sb.append(b);

        System.out.println(sb);
    }
}
