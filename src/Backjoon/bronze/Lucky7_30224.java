package Backjoon.bronze;

// https://www.acmicpc.net/problem/30224

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lucky7_30224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);

        if (!input.contains("7") && n % 7 != 0) {
            System.out.println(0);
        } else if (!input.contains("7") && n % 7 == 0) {
            System.out.println(1);
        } else if (input.contains("7") && n % 7 != 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
