package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/2805

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 집으로 가져갈 나무의 길이
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int left = 0;
        int right = arr[N - 1];


        while (left <= right) {
            int mid = (left + right) / 2; // 톱날의 길이
            int tree = 0;

            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) tree += (arr[i] - mid);
            }

            if (tree >= M) { // 적어도 M만큼에 가까워지도록 절단기(mid)를 조정해야함
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        System.out.println(right);
    }
}