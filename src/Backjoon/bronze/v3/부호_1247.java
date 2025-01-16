package Backjoon.bronze.v3;

// https://www.acmicpc.net/problem/1247

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.math.BigInteger.*;

public class 부호_1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            BigInteger answer = ZERO;
            for (int j = 0; j < n; j++) {
                answer = answer.add(new BigInteger(br.readLine()));
            }


            if (answer.signum() > 0) {
                sb.append("+");
            } else if (answer.signum() == 0) {
                sb.append("0");
            } else {
                sb.append("-");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
