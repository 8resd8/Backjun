package 과거의산물.조건문;

import java.util.Scanner;

public class _2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isYear = false;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isYear = true;
        }

        System.out.println(isYear ? "1" : "0");
    }
}
