package 과거의산물.조건문;

import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int prize = 0;

        if (one == two && one == three) { // 같은 눈이 3개
            prize = 10000 + one * 1000;
        } else if (one == two || one == three || two == three) { // 같은 눈이 2개
            int same = one;
            if (two == three) {
                same = two;
            }
            prize = 1000 + same * 100;
        } else { // 모두 다른 눈
            int max = Math.max(one, two);
            max = Math.max(max, three);
            prize = max * 100;
        }
        System.out.println(prize);
    }
}