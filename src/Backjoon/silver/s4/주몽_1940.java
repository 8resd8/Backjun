package Backjoon.silver.s4;

// https://www.acmicpc.net/problem/1940

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        int count = 0;
        while (left < right) {
            int l = arr[left];
            int r = arr[right];
            int sum = l + r;

            if (sum == m) {
                count++;
            }

            if (sum < m) {
                left++;
            } else {
                right--;
            }
        }


        System.out.println(count);
    }
}
