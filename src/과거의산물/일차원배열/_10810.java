package 과거의산물.일차원배열;

import java.util.Scanner;

public class _10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니의 개수
        int m = sc.nextInt(); // 공을 넣을 총 횟수
        int[] arr = new int[n + 1]; // n개의 칸의 바구니

        int start = 0;
        int end = 0;
        int ballNumber = 0;

        for (int i = 0; i < m; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            ballNumber = sc.nextInt();

            for (int j = start; j <= end; j++) {
                arr[j] = ballNumber;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}