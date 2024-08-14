package 과거의산물.약수배수와소수;

import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int division = 2;

        while (n > 1) {
            if (n % division == 0) {
                System.out.println(division);
                n /= division;
            } else {
                division++;
            }
        }

    }
}