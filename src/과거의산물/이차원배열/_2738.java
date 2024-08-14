package 과거의산물.이차원배열;

import java.util.Scanner;

public class _2738 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] result = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] += sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] += sc.nextInt();
            }
        }

        for(int[] ar : result) {
            for(int a : ar) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}