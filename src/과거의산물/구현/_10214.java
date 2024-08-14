package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int sumY = 0;
            int sumK = 0;
            for (int j = 0; j < 9; j++) {
                sumY += sc.nextInt(); // 연세대
                sumK += sc.nextInt(); // 고려대
            }
            if (sumY == sumK) {
                System.out.println("Draw");
            } else {
                System.out.println(sumY > sumK ? "Yonsei" : "Korea");
            }


        }

    }
}