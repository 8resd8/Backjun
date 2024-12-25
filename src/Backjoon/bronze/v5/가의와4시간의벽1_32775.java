package Backjoon.bronze.v5;

// https://www.acmicpc.net/problem/32775

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가의와4시간의벽1_32775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine()); // 철도
        int F = Integer.parseInt(br.readLine()); // 항공

        if (S <= F) System.out.println("high speed rail");
        else System.out.println("flight");
    }
}
