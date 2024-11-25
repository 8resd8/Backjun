package Backjoon.bronze;

// https://www.acmicpc.net/problem/14581

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팬들에게둘러싸인홍준_14581 {
    public static void main(String[] args) throws IOException {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String fan = ":fan:";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && i == j) {
                    sb.append(":").append(input).append(":");
                    continue;
                }
                sb.append(fan);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
