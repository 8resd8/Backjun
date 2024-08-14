package 과거의산물.조합론;

import java.io.*;

public class _1010 {

    static int[][] dp = new int[30][30];

    static int combination(int n, int r) {
        // 이미 검색이 되었다면 그대로 값 반환 >
        if (dp[n][r] != 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // nCr 공식
        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            System.out.println(combination(m, n));
        }

    }
}