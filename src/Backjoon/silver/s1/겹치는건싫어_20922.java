package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/20922

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 겹치는건싫어_20922 {
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int maxLength = 0;
        int[] arr = new int[N + 1]; // 입력
        int[] feq = new int[200001]; // 빈도확인

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int curLength = 0;
        while (right < N && left < N) {
            int cur = arr[right];
            feq[cur]++;

            // K개 넘으면 왼쪽, 오른쪽 줄이고 다시 계산
            if (feq[cur] > K) {
                feq[arr[left]]--;
                feq[cur]--;
                curLength--;
                left++;
                continue;
            }
            right++;

            curLength++;
            maxLength = Math.max(maxLength, curLength);
        }

        System.out.println(maxLength);
    }
}
