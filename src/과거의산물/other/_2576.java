package 과거의산물.other;

import java.util.Scanner;

public class _2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int sum = 0;
        int minValue = Integer.MAX_VALUE;
        boolean check = true;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input % 2 != 0) {
                sum += input;
                minValue = Math.min(minValue, input);
                check = false;
            }
        }

        // 홀수가 1개도 없는 경우
        if (check) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minValue);
        }

    }
}