package Backjoon.bronze.v5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32929

public class UOS문자열_32929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()) % 3;

        if (input == 1) {
            System.out.println("U");
        } else if (input == 2) {
            System.out.println("O");
        } else if (input == 0) {
            System.out.println("S");
        }
    }
}
