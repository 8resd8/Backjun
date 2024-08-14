package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 두개의숫자열D2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int testCase = 1; testCase <= t; testCase++) {
            String[] nm = br.readLine().split(" ");
            int N = Integer.parseInt(nm[0]);
            int M = Integer.parseInt(nm[1]);

            String[] inputA = br.readLine().split(" ");
            String[] inputB = br.readLine().split(" ");

            int[] A = new int[N];
            int[] B = new int[M];

            // A, B 입력
            for (int i = 0; i < inputA.length; i++) {
                A[i] = Integer.parseInt(inputA[i]);
            }

            for (int i = 0; i < inputB.length; i++) {
                B[i] = Integer.parseInt(inputB[i]);
            }

            // 짧은 길이, 긴 길이 구분
            int minLength = Math.min(N, M);
            int maxLength = Math.max(N, M);
            int max = Integer.MIN_VALUE;

            for (int i = 0; i <= maxLength - minLength; i++) {
                int sum = 0;

                for (int j = 0; j < minLength; j++) {
                    if (A.length < B.length) {
                        sum += A[j] * B[j + i]; // B가 더 긴 길이인 경우
                    } else {
                        sum += A[j + i] * B[j];
                    }

                }
                max = Math.max(max, sum);
            }


            System.out.println("#" + testCase + " " + max);
        }

    }
}
