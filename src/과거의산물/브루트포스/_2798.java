package 과거의산물.브루트포스;

import java.util.Scanner;

public class _2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 카드의 개수
        int target = sc.nextInt(); // target값과 가까운 값 찾기
        int[] arr = new int[n];
        int maxSum = 0;

        // 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 모든 경우의 수 검사
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == target) {
                        maxSum = sum;
                        System.out.println(maxSum);
                        return;
                    } else if(sum < target && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);

    }
}