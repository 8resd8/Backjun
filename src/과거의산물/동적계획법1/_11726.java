package 과거의산물.동적계획법1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] square = new long[n + 1];
        if (n == 1) {
            System.out.println(1);
            return;
        }
        square[1] = 1;
        square[2] = 2;


        for (int i = 3; i <= n; i++) {
            square[i] = square[i - 1] + square[i - 2] % 10007;
        }
        System.out.println(square[n] % 10007);

    }
}