package Backjoon.bronze.v2;

// https://www.acmicpc.net/problem/2495

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속구간_2495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            int count = 1;
            int max = 0;
            for (int j = 1; j < input.length(); j++) {
                if (input.charAt(j) == input.charAt(j - 1)) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }

            System.out.println(Math.max(max, count));
        }
    }
}
