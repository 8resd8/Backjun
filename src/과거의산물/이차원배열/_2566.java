package 과거의산물.이차원배열;

import java.util.Scanner;

public class _2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[9][9];
        int max = Integer.MIN_VALUE;
        int row = 0, column = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                input[i][j] = sc.nextInt();

                if (max < input[i][j]) {
                    max = input[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        // 0 ~ 8까지로 했기에 1을 더해줘야 한다.
        System.out.printf("%d\n%d %d\n", max, row + 1, column + 1);

    }
}