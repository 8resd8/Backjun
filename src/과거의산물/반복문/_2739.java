package 과거의산물.반복문;

import java.util.Scanner;

public class _2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gugudan = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", gugudan, i, gugudan * i);

        }

    }
}
