package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2467

public class 용액_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = n - 1;
        int[] values = new int[2];
        int min = Integer.MAX_VALUE;
        while (left < right) {
            int lv = arr[left];
            int rv = arr[right];
            int sum = lv + rv;

            // 절댓값이 0과 가까워야한다.
            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                values[0] = lv;
                values[1] = rv;
                if (min == 0) break;
            }

            if (sum > 0) right--;
            else if (sum < 0) left++;
        }

        System.out.println(values[0] + " " + values[1]);
    }
}