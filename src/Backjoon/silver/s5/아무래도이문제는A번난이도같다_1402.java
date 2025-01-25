package Backjoon.silver.s5;

// https://www.acmicpc.net/problem/1402

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 아무래도이문제는A번난이도같다_1402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // a * b = A AND a + b = B 만족시키는 값이 존재하면 yes
        StringBuilder sb = new StringBuilder();

        for (int testCase = 0; testCase < n; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("y").append("e").append("s").append("\n");
        }

        System.out.print(sb);
    }
}
