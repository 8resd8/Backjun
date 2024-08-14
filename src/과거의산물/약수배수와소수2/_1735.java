package 과거의산물.약수배수와소수2;

import java.util.Scanner;

public class _1735 {

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
        int topA = sc.nextInt();
        int downA = sc.nextInt();
        int topB = sc.nextInt();
        int downB = sc.nextInt();

        int 최대공약수 = 유클리드호제법(downA, downB);
        int 최소공배수 = downA * downB / 최대공약수;
        int newTop = (최소공배수 / downA * topA) + (최소공배수 / downB * topB);
        int newDown = 최소공배수;

        int 기약분수확인값 = 유클리드호제법(newTop, newDown);

        if (newTop % 기약분수확인값 == 0 && newDown % 기약분수확인값 == 0) {
            newTop /= 기약분수확인값;
            newDown /= 기약분수확인값;
        }
        System.out.printf("%d %d\n", newTop, newDown);

    }
}