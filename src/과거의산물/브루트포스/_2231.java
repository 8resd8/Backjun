package 과거의산물.브루트포스;

import java.util.Scanner;

public class _2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        for (int i = 1; i < input; i++) {
            int n = i;
            int madeSum = i;

            // 분해합 찾는 조건
            while (n > 0) {
                madeSum += n % 10;
                n /= 10;
            }

            // 분해합의 생성자가 입력값과 같은 경우
            if (madeSum == input) {
                System.out.println(i);
                return;
            }
        }

        // 찾지 못한 경우 출력
        System.out.println(0);

    }
}