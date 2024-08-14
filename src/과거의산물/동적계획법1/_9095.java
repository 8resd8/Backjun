package 과거의산물.동적계획법1;

import java.io.*;

public class _9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] dp = new int[12];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 0; i < testCase; i++) {
            int input = Integer.parseInt(br.readLine());
            for (int j = 3; j <= input; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[input - 1]);
        }

    }
}