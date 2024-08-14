package 과거의산물.심화1;

import java.util.Scanner;

public class _10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean 팰린드롬일까 = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                팰린드롬일까 = false;
                break;
            }
        }
        System.out.println(팰린드롬일까 ? 1 : 0);

    }
}