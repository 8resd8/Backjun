package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) System.out.print("*");
            else {
                System.out.print("*");
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }


            System.out.println();
        }


    }
}
