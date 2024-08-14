package 과거의산물.약수배수와소수2;

import java.util.Scanner;

public class _13241 {

    private static long 유클리드호제법(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long 최대공약수 = 유클리드호제법(a, b);
        long 최소공배수 = (a * b) / 최대공약수;

        System.out.println(최소공배수);
    }
}