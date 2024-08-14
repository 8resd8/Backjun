package 과거의산물.문자열;

import java.util.Scanner;

public class _2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String tempA = "";
        String tempB = "";


        for (int i = 0; i < 3; i++) {
            tempA += a.charAt(a.length() - 1 - i);
            tempB += b.charAt(b.length() - 1 - i);
        }

        int intA = Integer.parseInt(tempA);
        int intB = Integer.parseInt(tempB);
        System.out.println(Math.max(intA, intB));

    }
}