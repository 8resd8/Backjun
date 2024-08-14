package 과거의산물.구현;

import java.util.Scanner;

public class _2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            sum += (number * number);
        }
        System.out.println(sum % 10);


    }
}
