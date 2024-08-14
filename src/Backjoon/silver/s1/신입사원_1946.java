package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 신입사원_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
//        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();

        for (int i = 0; i < t; i++) {
            int[][] arr = new int[t][2];

            for (int j = 0; j < t; j++) {
                int a = input[0];
                int b = input[1];

                arr[j][0] = a;
                arr[j][1] = b;
            }

            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

            int minCondition = arr[0][1];
            int count = 1;

            for (int j = 1; j < t; j++) {
                if (arr[j][1] < minCondition) {
                    count++;
                    minCondition = arr[j][1];
                }
            }
            System.out.println(count);

        }
    }
}