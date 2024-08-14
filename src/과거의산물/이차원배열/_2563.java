package 과거의산물.이차원배열;

import java.util.Scanner;

public class _2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 검은 색종이의 수
        int[][] square = new int[100][100]; // 100 * 100 크기의 도화지
        int area = 0;

        // 2개의 색종이를 n개 입력
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // 가로값
            int y = sc.nextInt(); // 세로값

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    square[j][k] = 1;
                }
            }
        }

        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if (square[j][k] == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}