package 과거의산물.구현;

import java.util.Scanner;

public class _3062 {

    public static StringBuilder reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String reverse = String.valueOf(reverse(input));
            // 초기값 124 input

            // 뒤집기 421 reverse

            // 초기값 + 뒤깁기 --> 좌우 대칭이냐?
            int result = Integer.parseInt(input) + Integer.parseInt(reverse);

            // 비교 1
            String value = String.valueOf(result);
            // 비교 2
            String value2 = String.valueOf(reverse(value));
            // 같냐?
            if (value2.equals(value)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }



    }
}
