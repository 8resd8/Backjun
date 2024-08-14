package Backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 오르막길_2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;

        int start = input[0]; // 첫번째 값
        int value = 0;
        for (int i = 1; i < t; i++) {
            // 증가하는 경우
            if (input[i] > input[i - 1]) {
                value = input[i];
                max = Math.max(max, value - start);
            } else { // 증가하지 않는다면
                start = input[i];
            }

        }
        System.out.println(max);
    }
}
