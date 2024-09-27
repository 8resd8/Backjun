package Backjoon.gold.g4;

// https://www.acmicpc.net/problem/1806

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        System.out.println(getAnswer2(N, S, arr));
    }

    // 버전 2: 192ms
    private static int getAnswer2(int N, int S, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = 0;

        while (left < N) {
            if (sum < S && right < N) {
                sum += arr[right++];
                length++;
                continue;
            }
            if (sum >= S) answer = Math.min(answer, length);

            sum -= arr[left++]; // right를 초기화시키는 것이 아니라 왼쪽을 당기면서 제일 왼쪽 삭제
            length--;
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    // 버전 1: 940ms
    private static int getAnswer(int N, int S, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = 0;

        while (left < N) {
            if (answer == 0) break;

            if (sum >= S || right >= N) {
                if (sum >= S) answer = Math.min(answer, length);

                left++;
                length = 0;
                right = left;
                sum = 0;
                continue;
            }


            sum += arr[right];
            right++;
            length++;
        }
        return answer;
    }
}