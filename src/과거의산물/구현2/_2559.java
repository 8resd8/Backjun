package 과거의산물.구현2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _2559 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = Arrays.stream(arr, i, k + i).sum();

            System.out.print(sum + " ");
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("\n\n" + maxSum);


    }
}