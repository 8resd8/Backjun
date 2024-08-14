package 과거의산물.동적계획법1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _13398다시해봐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] dp = new int[n];
        int[] remove = new int[n];
        int maxSum = input[0];

        dp[0] = input[0];
        remove[0] = input[0];

        // 최대 부분 배열 합 계산
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + input[i], input[i]);

            remove[i] = Math.max(dp[i - 1], remove[i - 1] + input[i]);

            maxSum = Math.max(maxSum, Math.max(dp[i], remove[i]));
        }

        System.out.println(maxSum);

    }
}