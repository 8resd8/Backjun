package 과거의산물.일차원배열;

import java.util.Scanner;

public class _10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 바구니
        int m = sc.nextInt(); // 공을 교환할 횟수
        int[] arr = new int[n + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}