package 과거의산물.구현;

import java.util.Scanner;

public class _2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int back = 100;
        int result = -5;

        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();

            if (Math.abs(back - sum) <= back) {
                back = Math.abs(100 - sum);
                result = sum;
            }
        }
        System.out.println(result);

    }
}
