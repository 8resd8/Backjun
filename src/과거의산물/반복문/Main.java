package 과거의산물.반복문;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));

            while (true) {
                if (sb.indexOf("3") != -1) {
                    sb.deleteCharAt(sb.indexOf("3"));
                    result++;
                } else if (sb.indexOf("6") != -1) {
                    sb.deleteCharAt(sb.indexOf("6"));
                    result++;
                } else if (sb.indexOf("9") != -1) {
                    sb.deleteCharAt(sb.indexOf("9"));
                    result++;
                } else {
                    break;
                }


            }
        }
        System.out.println(result);

    }
}