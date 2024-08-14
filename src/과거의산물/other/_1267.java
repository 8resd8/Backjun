package 과거의산물.other;

import java.util.Scanner;

public class _1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Y = 0, M = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            Y += (input / 30 + 1) * 10;
            M += (input / 60 + 1) * 15;
        }

        if (Y < M) {
            System.out.printf("Y %d\n", Y);
        } else if (Y == M) {
            System.out.printf("Y M %d\n", Y);
        } else {
            System.out.printf("M %d\n", M);
        }


    }
}