package 과거의산물.일반수학1;

import java.util.Scanner;

public class _2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int start = 2;
        int sum = 0;

        for (int i = 0; i < input; i++) {
            sum = (int) (start + Math.pow(2, i));
            start = sum;
//            System.out.printf("input = %d, sum = %d \n", i + 1, sum);
        }

        int result = sum * sum;
        System.out.println(result);

//    input
        //1  3 * 3    1     (2 + 2^0) = 3
        //2  5 * 5    2     (3 + 2^1) = 5
        //3  9 * 9    4     (5 + 2^2) = 9
        //4  17 * 17  8     (9 + 2^3) = 17
        //5  33 * 33  16    (17 + 2^4)

    }
}