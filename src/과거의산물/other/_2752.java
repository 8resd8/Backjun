package 과거의산물.other;

import java.util.Arrays;
import java.util.Scanner;

public class _2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i: arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();

    }
}