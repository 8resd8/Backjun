package 과거의산물.other;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = input;
        int plusNumber = 0;
        int count = 0;

        while (true) {
            plusNumber = (input / 10) + (input % 10);
//            System.out.printf("%d + %d = %d \n", input / 10, input % 10, plusNumber);

            if (plusNumber < 10) {
                input = (input % 10 * 10) + plusNumber;
            } else {
                input = (input % 10 * 10) + (plusNumber % 10);
            }
            count++;

            if (input == result) {
                System.out.println(count);
                break;
            }
        }


    }
}