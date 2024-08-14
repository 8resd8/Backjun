package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        String[] input = br.readLine().split(",");

        int n = Integer.parseInt(NK[0]);
        int k = Integer.parseInt(NK[1]);
        int[] intInput = new int[n];
        for (int i = 0; i < input.length; i++) {
            intInput[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                intInput[j] = intInput[j + 1] - intInput[j];
            }
        }

        for (int i = 0; i < n - k; i++) {
            System.out.print(intInput[i]);
            if (i < n - k - 1) {
                System.out.print(",");
            }
        }


    }
}
