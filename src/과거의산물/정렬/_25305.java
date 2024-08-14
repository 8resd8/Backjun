package 과거의산물.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class _25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 응시자의 수
        int k = sc.nextInt(); // 점수 높은 k명
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length - k]);

    }
}