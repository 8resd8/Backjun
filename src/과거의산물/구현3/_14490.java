package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(":");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int value = calcul(n, m);
        System.out.print(n / value + ":" + m / value);
    }

    private static int calcul(int n, int m) {
        if (m == 0) {
            return n;
        }

        return calcul(m, n % m);
    }
}