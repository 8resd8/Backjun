package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 안테나_18310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(input);

        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < t / 2; i++) {
            int value = input[i];
            for (int j = 0; j < t; j++) {
                value += Math.abs(input[j] - input[i]);
            }
            if (min > value) {
                min = value;
                answer = input[i];
            }
        }

        System.out.println(answer);
    }
}
