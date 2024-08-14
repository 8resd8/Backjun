package 과거의산물.기하_직사각형과삼각형;

import java.util.Scanner;

public class _5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int maxLength = a;

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 삼각형 조건 확인
            maxLength = Math.max(maxLength, b);
            maxLength = Math.max(maxLength, c);
            boolean isTriangle = false;

            if (maxLength == a && maxLength < (b + c)) {
                isTriangle = true;
            } else if (maxLength == b && maxLength < (a + c)) {
                isTriangle = true;
            } else if (maxLength == c && maxLength < (a + b)) {
                isTriangle = true;
            }


            if (!isTriangle) { // 삼각형인지 먼저 확인
                System.out.println("Invalid");
            } else if (a == c && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

        }


    }

}