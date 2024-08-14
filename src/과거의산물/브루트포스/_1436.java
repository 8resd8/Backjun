package 과거의산물.브루트포스;

import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 665;
        int count = 0;

        while (count < n) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }
        System.out.println(number);

    }
}