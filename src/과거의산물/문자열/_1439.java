package 과거의산물.문자열;

import java.util.Scanner;

public class _1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int toZero = 0; // 0으로 만들 때
        int toOne = 0; // 1로 만들 때

        if (input.charAt(0) == '0') {
            toOne++;
        } else {
            toZero++;
        }

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) != input.charAt(i)) {
                if (input.charAt(i) == '0') {
                    toOne++;
                } else {
                    toZero++;
                }
            }
        }
        System.out.println(Math.min(toZero, toOne));


    }
}