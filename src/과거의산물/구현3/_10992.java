package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*
         * 공백3 별1
         * 공백2 별2
         * 공백1 별2
         * 공백0 별n*2 - 1
         * */

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                System.out.print("*");
            } else if (i == n - 1) {
                for (int j = 0; j < n * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
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
