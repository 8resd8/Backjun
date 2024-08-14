package 과거의산물.약수배수와소수;

import java.util.Scanner;

public class _5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 종료 조건
            if (a == 0 && b == 0){
                break;
            }

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a / b > 0 && a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

    }
}