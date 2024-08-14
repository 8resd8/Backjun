package 과거의산물.일차원배열;

import java.util.Scanner;

public class _10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.println();

    }
}