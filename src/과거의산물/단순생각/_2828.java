package 과거의산물.단순생각;

import java.io.IOException;
import java.util.Scanner;

public class _2828 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 스크린 칸?
        int M = sc.nextInt(); // 바구니 크기
        int J = sc.nextInt(); // 사과의 개수
        int[] apples = new int[J];

        for (int i = 0; i < J; i++) {
            apples[i] = sc.nextInt(); // 사과가 떨어지는 위치
        }


        int minMove = 0;
        int left = 1; // 바구니 왼쪽
        int right = M; // 바구니 오른쪽
        for (int apple : apples) {
            if (left > apple) {
                minMove += (left - apple);
                left = apple;
                right = apple + M - 1;
            } else if (right < apple) {
                minMove += (apple - right);
                left = apple - M + 1;
                right = apple;
            }


        }


        System.out.println(minMove);
    }
}