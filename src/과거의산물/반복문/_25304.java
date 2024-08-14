package 과거의산물.반복문;

import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt(); // 물건의 가격
            int count = sc.nextInt(); // 물건의 개수
            result += cost * count;
        }

        System.out.println(bill == result ? "Yes" : "No");

    }
}
