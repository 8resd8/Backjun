package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);

        long result = calculate(a, b, c);

        System.out.println(result);
    }

    static long calculate(long a, long b, long c) {
        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            long result = calculate(a, b / 2, c);
            return (result * result) % c;
        } else {
            long result = calculate(a, (b - 1) / 2, c);
            return (result * result % c) * a % c;
            // result * result값이 long을 넘어가기때문에 먼저 c로 나누기
            // 위에 return (result * result) % c와 동일한 이유
        }
    }
}
// 지수가 홀수라면 1을 빼주고 빼줬으니깐 그만큼의 a값을 곱해준다.
// 따라서 짝수일때와 동일한 계산식이 된다.