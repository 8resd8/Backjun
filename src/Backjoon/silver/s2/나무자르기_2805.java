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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 절단기 높이 정하기 H, 지정하면 H만큼 위로 올라가고 그 줄 나무를 모두 절단,
        // H보다 큰 나무는 길이 - H만큼 나무가 잘릴것, 그 아래는 안잘림.
        // 20 15 10 17 일때 15로 지정하면 5 0 0 2 잘리고 모두 15로 바뀔것, 총 7을 가져간다.
        // 나무를 필요한 만큼만 집에 가져가고 싶음. 하지만 최소 M을 가져가고 싶다.
        // 그럴 땐 H 설정을 어떻게 하는 것이 좋은가? 높이의 최댓값 H를 구해라.

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = arr[N - 1];

        while (left <= right) {
            int mid = (left + right) / 2;
            long tree = 0;

            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) tree += (arr[i] - mid);
            }

            if (tree >= M) {
                left = mid + 1;
            } else if (tree < M) {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}
