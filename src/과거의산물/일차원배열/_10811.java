package 과거의산물.일차원배열;

import java.util.Scanner;

public class _10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니의 개수
        int m = sc.nextInt(); // 뒤집을 횟수
        int[] arr = new int[n + 1]; // 1 ~ n개의 칸의 바구니


        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

//        int start = 0;
//        int end = 0;

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int temp = arr[start + j];
                arr[start + j] = arr[end - j];
                arr[end - j] = temp;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}
// 1 2 3 4 5    1 2
// 2 1 3 4 5    3 4
// 2 1 4 3 5    1 4
// 3 4 1 2 5    2 2
// 3 4 1 2 5