package 과거의산물.other;

import java.util.Scanner;

public class _5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 3; j < n; j++) {
                minCost = Math.min(minCost, arr[i] + arr[j] - 50);
            }
        }
        System.out.println(minCost);


    }
}