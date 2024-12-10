package Backjoon.bronze;

// https://www.acmicpc.net/problem/27434

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 팩토리얼3_27434 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(1);
            return;
        }

        System.out.println(fact(1, N));
    }

    private static BigInteger fact(int a, int n) {
        if (a > n) return BigInteger.ONE;
        if (a == n) return BigInteger.valueOf(a);

        int b = (a + n) / 2;
        return fact(a, b).multiply(fact(b + 1, n));
    }
}
