package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String cloud = br.readLine();
            for (int j = 0; j < m; j++) {
                if (cloud.charAt(j) == 'c') arr[i][j] = 0;
                else arr[i][j] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < m; j++) {
                if (arr[i][j - 1] >= 0 && arr[i][j] != 0) {
                    arr[i][j] = count++;
                    continue;
                }
                count = 1;
            }
        }


        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}