package 과거의산물.브루트포스;

import java.util.Scanner;

public class _19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = -999, y = -999;

        while (y < 1000) {
            // y = -999일때 x값이 -999 ~ 999까지 확인, y값 늘리면서 모든 경우 탐색
            while (x < 1000) {
                if ((a * x) + (b * y) == c && (d * x) + (e * y) == f) {
                    System.out.printf("%d %d\n", x, y);
                    return;
                }
                x++;
            }
            y++;
            x = -999;
        }


    }
}