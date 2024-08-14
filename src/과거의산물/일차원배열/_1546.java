package 과거의산물.일차원배열;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 과목
        double[] arr = new double[n];
        double maxScore = Integer.MIN_VALUE;
        double sum = 0, avg = 0;


        // 1. 최댓값 구하기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (maxScore < arr[i]) {
                maxScore = arr[i];
            }
        }

        // 2. 점수 조작하기 (1번 for안에서 합쳐도 가능)
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxScore * 100; // 조작한 점수
            sum += arr[i];
        }

        avg = sum / n;
        System.out.println(avg);

    }
}