package Backjoon.bronze.v2;

// https://www.acmicpc.net/problem/4592

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중복을없애자_4592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            int number = 0;
            for (int i = 0; i < n; i++) {
                int input = Integer.parseInt(st.nextToken());

                if (i > 0 && number == input) {
                    continue;
                }

                number = input;
                sb.append(input).append(" ");
            }
            sb.append("$").append("\n");
        }

        System.out.print(sb);
    }
}
