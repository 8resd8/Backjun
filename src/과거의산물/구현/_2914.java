package 과거의산물.구현;

import java.util.Scanner;

public class _2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(); // 38
        double b = sc.nextDouble(); // 24
        int value = (int)Math.ceil(a * (b - 1) + 1);

        System.out.print(value);



    }
}
