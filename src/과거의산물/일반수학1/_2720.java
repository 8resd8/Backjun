package 과거의산물.일반수학1;

import java.util.Scanner;

public class _2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //  총 개수
        int[] input = new int[n];

        // 거스름돈의 액수 * 100 --> 입력에서도 원래 1.24가 돼야 하지만
        // 124로 입력을 주므로 똑같이 * 100을 해주기
        int[] Change = {25, 10, 5, 1};

        // n개 만큼 입력
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        for (int element : input) {
            for (int change : Change) {
                System.out.printf("%d ", element / change);
                element %= change;
            }
            System.out.println();
        }

    }
}