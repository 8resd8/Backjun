package 과거의산물.구현3;

import java.io.IOException;
import java.util.Scanner;

public class _2863 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        double value0 = (double) A / C + (double) B / D;  // 원래 상태
        double value1 = (double) C / D + (double) A / B;  // 90도 회전
        double value2 = (double) D / B + (double) C / A;  // 180도 회전
        double value3 = (double) B / A + (double) D / C;  // 270도 회전

        double maxValue = value0;
        int maxRotation = 0;

        if (value1 > maxValue) {
            maxValue = value1;
            maxRotation = 1;
        }
        if (value2 > maxValue) {
            maxValue = value2;
            maxRotation = 2;
        }
        if (value3 > maxValue) {
            maxValue = value3;
            maxRotation = 3;
        }

        // 결과 출력
        System.out.println(maxRotation);


    }
}
