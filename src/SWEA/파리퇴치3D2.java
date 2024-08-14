package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파리퇴치3D2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= t; testCase++) {
            String[] nm = br.readLine().split(" ");
            int N = Integer.parseInt(nm[0]); // N * N 크기
            int M = Integer.parseInt(nm[1]); // 분사의 세기
            int[][] pari = new int[N][N];

            // 입력
            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < input.length; j++) {
                    pari[i][j] = Integer.parseInt(input[j]);
                }
            }

            int maxPlus = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    maxPlus = Math.max(maxPlus, searchPlus(pari, j, i, M));
                    maxPlus = Math.max(maxPlus, searchX(pari, j, i, M));
                }
            }


            System.out.printf("#%d %d\n", testCase, maxPlus);
        }
    }

    private static int searchX(int[][] pari, int x, int y, int M) {
        int sum = pari[y][x]; // 스프레이 분사 지점

        for (int i = 1; i < M; i++) {
            if (isValid(pari, x + i, y + i)) sum += pari[y + i][x + i]; // \ 아래
            if (isValid(pari, x - i, y - i)) sum += pari[y - i][x - i]; // \ 위
            if (isValid(pari, x - i, y + i)) sum += pari[y + i][x - i]; // / 아래
            if (isValid(pari, x + i, y - i)) sum += pari[y - i][x + i]; // / 위
        }
        return sum;
    }

    private static int searchPlus(int[][] pari, int x, int y, int M) {
        int sum = pari[y][x]; // 스프레이 분사 지점

        for (int i = 1; i < M; i++) {
            if (isValid(pari, x - i, y)) sum += pari[y][x - i]; // 왼쪽
            if (isValid(pari, x + i, y)) sum += pari[y][x + i]; // 오른쪽
            if (isValid(pari, x, y - i)) sum += pari[y - i][x]; // 위
            if (isValid(pari, x, y + i)) sum += pari[y + i][x]; // 아래
        }
        return sum;
    }

    private static boolean isValid(int[][] pari, int x, int y) {
        return x >= 0 && y >= 0 && x < pari.length && y < pari.length; // n*n
    }

    private static void printPari(int[][] pari) {
        for (int[] ints : pari) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}