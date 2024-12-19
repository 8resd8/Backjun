package Backjoon.bronze.v5;

// https://www.acmicpc.net/problem/32384

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사랑은고려대입니다_32384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++) {
            sb.append("LoveisKoreaUniversity").append(" ");
        }
        System.out.println(sb);
    }
}
