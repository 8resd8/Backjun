package 과거의산물.동적계획법1;

import java.io.*;

public class _24416 {

    static int[] dp;
    static int count = -1;

    public static int fibonacci(int n) {
        dp = new int[n + 1];

        if (n == 0) {
            return 0;
        }
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
            count++;
        }

        return dp[n - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = fibonacci(n);

        System.out.println(result);

    }
}