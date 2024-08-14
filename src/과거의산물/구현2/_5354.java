package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j != 0 && k != 0 && j != n - 1 && k != n - 1) {
                        System.out.print("J");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
            System.out.println();


        }

    }
}