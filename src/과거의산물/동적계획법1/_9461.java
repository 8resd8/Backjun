package 과거의산물.동적계획법1;

import java.io.*;

public class _9461 {

    static long[] dp;
    public static long sumTriangle(int n) {
        dp = new long[n + 1];
        dp[0] = dp[1] = dp[2] = dp[3] = 1;
        dp[4] = dp[5] = 2;
        return 0;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());



        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (dp[n] != 0) {
                System.out.println(dp[n]);
                continue;
            } else {
                for (int i = 6; i <= n; i++) {
                    dp[i] = dp[i - 1] + dp[i - 5];
                }
            }
            System.out.println(dp[n]);

        }

    }
}