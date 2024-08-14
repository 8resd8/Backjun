package 과거의산물.구현;

import java.util.Scanner;

public class _10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number < 40) {
                number = 40;
            }
            sum += number;
        }
        System.out.println(sum / 5);

    }
}