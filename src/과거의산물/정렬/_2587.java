package 과거의산물.정렬;

import java.util.*;

public class _2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);
        System.out.println(sum / n);    // 평균
        System.out.println(arr[n / 2]); // 중앙값

    }
}