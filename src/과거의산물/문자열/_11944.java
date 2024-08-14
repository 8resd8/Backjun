package 과거의산물.문자열;

import java.util.Scanner;

public class _11944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(n.repeat(Integer.parseInt(n)));

        if (sb.length() > m) {
            sb.setLength(m);
        }
        System.out.println(sb);


    }
}