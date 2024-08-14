package 과거의산물.구현;

import java.io.*;

public class _1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        int start = 10; // 기준 값
        int plus = 1; // 자리 수
        for (int i = 1; i <= n; i++) {
            // 10, 100, 1000 ...
            if (i < start) {
                sum += plus;
                continue;
            }

            // 여기로 오는 경우는 10, 100, 1000....
            start *= 10;
            plus++;
            sum += plus;
        }
        System.out.println(sum);

    }
}