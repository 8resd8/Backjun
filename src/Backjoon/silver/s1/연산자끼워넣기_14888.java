package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14888

public class 연산자끼워넣기_14888 {
    static int N, maxValue, minValue, saveOpIndex;
    static int[] operation, numbers;

    public static void main(String[] args) throws IOException {
        init();
        permutation(0, numbers[0]); // 숫자의 인덱스
        print();
    }

    private static void permutation(int index, int sum) {
        if (index == N - 1) { // N - 1개 연산자 만들면 확인, index는 +1 더 들어오기 때문에 1 뺴줌
            maxValue = Math.max(maxValue, sum);
            minValue = Math.min(minValue, sum);
            return;
        }

        for (int i = 0; i < 4; i++) { // "연산자 기준" 조합을 생성
            // operation 인덱스 찾기 (0이면 넘어가야함)
            if (operation[i] == 0) continue;

            operation[i]--;
            // 숫자의 인덱스는 i값이 아닌 매개변수의 index로 관리
            switch (i) {
                case 0: // +
                    permutation(index + 1, sum + numbers[index + 1]);
                    break;
                case 1: // -
                    permutation(index + 1, sum - numbers[index + 1]);
                    break;
                case 2: // *
                    permutation(index + 1, sum * numbers[index + 1]);
                    break;
                case 3: // /
                    permutation(index + 1, sum / numbers[index + 1]);
                    break;
            }
            operation[i]++; // 돌아오면 값 원상복구
        }
    }

    private static void print() {
        System.out.println(maxValue);
        System.out.println(minValue);
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        operation = new int[4];
        maxValue = Integer.MIN_VALUE;
        minValue = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operation[i] = Integer.parseInt(st.nextToken());
        }
    }
}