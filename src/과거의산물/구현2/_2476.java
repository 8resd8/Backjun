package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int prize = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            // 같은 숫자 3개인 경우
            if (a == b && a == c) {
                prize = Math.max(prize, 10000 + a * 1000);
            } else if (a == b || a == c) {
                prize = Math.max(prize, 1000 + a * 100);
            } else if (b == c) {
                prize = Math.max(prize, 1000 + b * 100);
            } else {
                int maxNumber = Math.max(a, Math.max(b, c));
                prize = Math.max(prize, maxNumber * 100);
            }
        }
        System.out.println(prize);


    }


}