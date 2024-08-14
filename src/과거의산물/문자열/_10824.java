package 과거의산물.문자열;

import java.io.IOException;
import java.util.Scanner;

public class _10824 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String ab = String.valueOf(a) + String.valueOf(b);
        String cd = String.valueOf(c) + String.valueOf(d);

        System.out.println(Long.parseLong(ab) + Long.parseLong(cd));

    }
}