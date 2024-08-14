package 과거의산물.백트래킹;

import java.io.*;
// https://www.acmicpc.net/problem/10974

public class _10974 {
    static int N;
    static int[] arr;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        used = new boolean[N + 1]; // 1 ~ N까지 사용

        generateResult(0);

    }

    private static void generateResult(int depth) {
        // 모두 선택이 되었다면 출력
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        // 1부터 N까지 이므로
        for (int i = 1; i <= N; i++) {
            if (!used[i]) {
                used[i] = true;
                arr[depth] = i;
                generateResult(depth + 1);

                used[i] = false; // 사용된것 초기화시키기
            }
        }

    }
}