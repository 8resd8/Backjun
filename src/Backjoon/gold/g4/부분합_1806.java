package Backjoon.gold.g4;

// https://www.acmicpc.net/problem/1806

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 부분합_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] nuSum = new int[N + 1];
        for (int i = 1; i < nuSum.length; i++) {
            nuSum[i] = nuSum[i - 1] + arr[i - 1];
        }

        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = 0;

        while (left < N) {
            if (arr[left] > S) {
                break;
            }

            if (sum >= S || right >= N) {
                if (sum >= S) answer = Math.min(answer, length);

                left++;
                length = 0;
                right = left;
                sum = 0;
                continue;
            }


            sum += arr[right];
//            System.out.printf("right: %d, arr[%d] = %d, sum: %d, length: %d\n ", right, right, arr[right], sum, length);
//            System.out.println("left = " + left);
            right++;
            length++;
        }

        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}