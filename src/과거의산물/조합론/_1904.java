package 과거의산물.조합론;

import java.io.*;

public class _1904 {

    static long[] dp = new long[1_000_001];
    static int[] fibo = new int[1000001];

    private static long tail(int n) {
        dp[0] = dp[1] = 1;
        dp[2] = 2;

        if (dp[n] != 0) {
            return dp[n];
        }

        if (n < 3) {
            return dp[n];
        }

        return dp[n] = (tail(n - 1) + tail(n - 2)) % 15746;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long n = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        // 2^1000000
//        long result = tail(n);
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 2;
        for (int i = 3; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 15746;
        }
        System.out.println(fibo[n]);

    }

}
// 0, 1로 이루어진 타일을 받았다.
// 0이 있는 타일에 0을 더 붙여서 00, 1의 타일이 있다.
// 01, 10은 따라서 불가능
// n = 1, 1     2^0
// n = 2, 00 11     2^1
// n = 3, 001 100 111   2^2
// n = 4, 0000, 0011, 1100, 1001, 1111  2^3
// n = 5, 00001, 00100, 00111, 10000, 10011, 11001, 11100, 11111 8개
// 1 2 3 5 8 13 --- 1 2 3 5개씩 증가
