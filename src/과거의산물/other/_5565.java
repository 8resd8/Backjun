package 과거의산물.other;

import java.util.Scanner;

public class _5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int cost = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            cost -= sc.nextInt();
        }
        System.out.println(cost);


    }
}