package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        while (true) {
            i++;
            String[] input = br.readLine().split(" ");
            int P = Integer.parseInt(input[1]); // P일 사용 가능
            int L = Integer.parseInt(input[0]); // L일 동안
            int V = Integer.parseInt(input[2]); // 총 휴가 기간
            int days = 0;

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            days = (V / P) * L + Math.min(V % P, L);

            System.out.printf("Case %d: %d\n", i, days);
        }


    }
}