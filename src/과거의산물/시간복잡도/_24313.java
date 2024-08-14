package 과거의산물.시간복잡도;

import java.util.Scanner;

public class _24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fxN = sc.nextInt(); // 7n
        int fxC = sc.nextInt(); // 7 (상수) 7n + 7

        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int A1 = fxN * n0 + fxC;
        int A2 = c * n0;

        if (A1 <= A2 && c >= fxN) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}