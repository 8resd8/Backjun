package 과거의산물.문자열;

import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int testCase = 0; testCase < n; testCase++) {
            int mutiple = sc.nextInt(); // 곱 할 횟수
            String input = sc.next();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < mutiple; j++) {
                    result.append(input.charAt(i));
                }
            }
            System.out.println(result);
        }

    }
}