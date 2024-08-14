package 과거의산물.구현;

import java.util.Scanner;

public class _2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n * 2) - (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
