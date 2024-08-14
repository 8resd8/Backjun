package 과거의산물.구현;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int k = sc.nextInt(); // k층
            int n = sc.nextInt(); // n호
            int[][] apt = new int[k + 1][n + 1];

            for (int j = 0; j <= n; j++) {
                apt[0][j] = j + 1;
            }

            for (int j = 0; j <= k; j++) {
                apt[j][0] = 1;
            }


            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    apt[j][l] = apt[j - 1][l] + apt[j][l - 1];
                }
            }

//            for (int j = 0; j <= k; j++) {
//                for (int l = 0; l <= n; l++) {
//                    System.out.printf("%d ", apt[j][l]);
//                }
//                System.out.println();
//            }


            System.out.println(apt[k][n - 1]);

        }


    }
}
