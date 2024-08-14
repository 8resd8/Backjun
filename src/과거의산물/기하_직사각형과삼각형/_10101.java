package 과거의산물.기하_직사각형과삼각형;

import java.util.Scanner;

public class _10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180) {
            if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }

    }
}