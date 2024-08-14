package 과거의산물.일차원배열;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i + 1; // 1 ~ 9까지 이므로 1을 더한다.
            }
        }
        System.out.printf("%d\n%d\n", max, idx);

    }
}