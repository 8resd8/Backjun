package Backjoon.bronze;

// https://www.acmicpc.net/problem/30030

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스위트콘가격구하기_30030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println((int) Math.round (input / 1.1));
    }
}
