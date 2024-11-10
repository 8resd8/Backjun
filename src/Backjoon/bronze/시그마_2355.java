package Backjoon.bronze;

// https://www.acmicpc.net/problem/2355

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시그마_2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long a = Math.min(Long.parseLong(input[0]), Long.parseLong(input[1]));
        long b = Math.max(Long.parseLong(input[0]), Long.parseLong(input[1]));

        long sum = (b - a + 1) * (a + b) / 2;
        System.out.println(sum);
    }
}
