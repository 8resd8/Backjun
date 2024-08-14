package 과거의산물.구현3;

import java.io.IOException;
import java.util.Scanner;

public class _2740 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int m2 = sc.nextInt();
        int K = sc.nextInt();
        int[][] B = new int[m2][K];

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < K; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] answer = new int[N][K];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                for (int l = 0; l < M; l++) {
                    answer[i][j] += A[i][l] * B[l][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }


    }
}
