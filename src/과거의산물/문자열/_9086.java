package 과거의산물.문자열;

import java.util.Scanner;

public class _9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));

//            System.out.println(s.substring(0, 1) + s.substring(s.length() - 1));
//            System.out.println(s.toCharArray()[0] + "" + s.toCharArray()[s.length() - 1]);
        }
    }
}