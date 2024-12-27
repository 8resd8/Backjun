package Backjoon.bronze.v5;

// https://www.acmicpc.net/problem/5341

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramids_5341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            sb.append(n * (n + 1) / 2).append("\n");
        }

        System.out.print(sb);
    }
}
