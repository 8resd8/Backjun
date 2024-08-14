package 과거의산물.문자열;

import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] costTimes = {2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            // A값은 3부터시작이고 costTimes배열에서 1번부터 시작.
            result += costTimes[input.charAt(i) - 'A' + 1];
        }
        System.out.println(result);
    }
}