package 과거의산물.약수배수와소수2;

import java.util.Scanner;

public class _1934 {

    private static int 유클리드호제법(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int 최대공약수 = 유클리드호제법(a, b);
            int 최소공배수 = (a * b) / 최대공약수;

            System.out.println(최소공배수);

    }
}