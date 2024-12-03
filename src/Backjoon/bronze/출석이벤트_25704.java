package Backjoon.bronze;

// https://www.acmicpc.net/problem/25704

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 출석이벤트_25704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loginNumber = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());

        System.out.println(circulate(price, loginNumber));
    }

    private static int circulate(int price, int loginNumber) {
        int total = price;
        if (loginNumber >= 20) {
            total = (int) Math.min(total, price * (1 - 0.25));
        }

        if (loginNumber >= 15) {
            total = Math.min(total, price - 2000);
        }

        if (loginNumber >= 10) {
            total = (int) Math.min(total, price * (1 - 0.1));
        }

        if (loginNumber >= 5) {
            total = Math.min(total, price - 500);
        }

        return Math.max(0, total);
    }
}
