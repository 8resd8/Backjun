package 과거의산물.재귀;

import java.io.*;
import java.util.Scanner;

public class _27433 {

    static long[] dp = new long[21];

    public static long factorial(int number) {

        dp[0] = dp[1] = 1;

        if (dp[number] != 0) {
            return dp[number];
        }

        return dp[number] = number * factorial(number - 1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));

    }
}