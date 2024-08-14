package 과거의산물.입출력과사칙연산;

import java.util.Scanner;

//public class _2588 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int temp = b;
//
//        while(temp > 0) {
//            System.out.println(a * (temp % 10));
//            temp /= 10;
//        }
//        System.out.println(a * b);
//
//    }
//}

public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String anotherB = Integer.toString(b);

        for (int i = anotherB.length() - 1; i >= 0; i--) {
            int digit = anotherB.charAt(i) - '0';
            System.out.println(a * digit);
        }
        System.out.println(a * b);

    }
}