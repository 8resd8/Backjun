package 과거의산물.other;

import java.util.Scanner;

public class _2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < 4; j++) {            switch (count) {
                case 1: // 도
                    System.out.println("A");
                    break;
                case 2: // 개
                    System.out.println("B");
                    break;
                case 3: // 걸
                    System.out.println("C");
                    break;
                case 4: // 윷
                    System.out.println("D");
                    break;
                default: // 모
                    System.out.println("E");
                    break;
            }
                int input = sc.nextInt();
                if (input == 0) {
                    count++;
                }
            }

        }


    }
}