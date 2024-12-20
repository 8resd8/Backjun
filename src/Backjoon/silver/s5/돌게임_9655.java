package Backjoon.silver.s5;

// https://www.acmicpc.net/problem/9655

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 돌게임_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 상근: SK, 창영: CY
        if (n % 4 == 0 || n % 4 == 2) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
