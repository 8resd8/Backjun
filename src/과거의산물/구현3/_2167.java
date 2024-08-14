package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int number = Integer.parseInt(input[j]);
                arr[i][j] = number;
            }
        }

        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1; // 1 ≤ i
            int b = Integer.parseInt(input[1]) - 1; // 1 ≤ i
            int c = Integer.parseInt(input[2]);
            int d = Integer.parseInt(input[3]);

            System.out.println(calculation(a, b, c, d, arr));
        }

    }

    private static int calculation(int a, int b, int c, int d, int[][] arr) {
        int sum = 0;
        for (int i = a; i < c; i++) {
            for (int j = b; j < d; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
