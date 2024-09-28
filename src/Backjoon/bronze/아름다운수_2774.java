package Backjoon.bronze;

// https://www.acmicpc.net/problem/2774

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 아름다운수_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int[] arr = new int[11];
            String input = br.readLine();
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                int value = Character.getNumericValue(input.charAt(j));
                if (arr[value]++ == 0) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}