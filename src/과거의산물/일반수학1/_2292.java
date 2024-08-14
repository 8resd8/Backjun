package 과거의산물.일반수학1;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        int step = 6;
        int range = 1;

        while (input > range) {
            range += step * count;
            count++;
        }
        System.out.println(count);

    }
}