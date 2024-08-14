package 과거의산물.구현;

import java.io.IOException;
import java.util.Scanner;

public class _10179 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double discount = 0.2;

        for (int i = 0; i < n; i++) {
            double cost = sc.nextDouble();
            System.out.printf("$%.2f\n", cost * (1 - discount));
        }

    }
}