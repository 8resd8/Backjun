package 과거의산물.약수배수와소수;

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            boolean check = true;

            if (input < 2) continue;

            for (int j = 2; j <= Math.sqrt(input); j++) {
                if (input % j == 0) {
                    check = false;
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.println(count);


    }
}