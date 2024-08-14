package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3151

public class 합이0_3151 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n <= 2) {
            System.out.println(0);
            return;
        }
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
        System.out.println(getCount(n, arr));
    }

    private static int getCount(int n, int[] arr) {
        int count = 0;
        int left = 0;
        int right = 1;
        int[] newArr = new int[n - 1];

        // 1차적인 합을 구해놓기 (n^3에서 n^2)
        for (int i = 1; i < n; i++) {
            newArr[i - 1] = arr[i - 1] + arr[i];
        }

        for (int i1 : newArr) {
            System.out.print(i1 + " ");
        }
        System.out.println();


        while (left < newArr.length - 1) {
            if (newArr[left] + newArr[right] == 0) {
                count++;
            }

            // right를 끝에 도달한 경우
            right++;
            if (right == newArr.length) {
                left++;
                right = left + 1;
            }

            // 0을 더이상 만들 수 없음
            if (newArr[left] > 0) {
                return count;
            }

        }
        return count;
    }
}