package 과거의산물.동적계획법1;


import java.io.IOException;
import java.util.Scanner;


public class _2579 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        int[] input = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n- 1; i++) {
            input[i] = sc.nextInt();
        }

        dp[0] = 0; // 시작점
        dp[1] = input[0]; // 첫번째 계단
        if (n > 2) {
            dp[2] = input[0] + input[1];
        }


        for (int i = 3; i < n; i++) {
            // 2칸 오르는 경우, 1 + 1칸 오르는 경우
            dp[i] = Math.max(dp[i - 2] + input[i - 1], dp[i - 3] + input[i - 2] + input[i - 1]);

        }
        System.out.println(dp[n - 1]);


    }
}