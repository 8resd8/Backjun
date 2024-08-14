package A알아두면좋을만한것들;

import java.util.Scanner;

public class 분할정복_거듭제곱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long result = calculate(a, b) % c;
        System.out.println(result);

    }

    private static long calculate(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            long result = calculate(a, b / 2);
            return result * result;
        } else {
            long result = calculate(a, (b - 1) / 2);
            return result * result * a;
        }
    }
}
// 지수가 홀수라면 1을 빼주고 빼줬으니깐 그만큼의 a값을 곱해준다.
// 따라서 짝수일때와 동일한 계산식이 된다.