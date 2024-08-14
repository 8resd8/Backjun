package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[t][t];
        int row = 0;
        int col = 0;

        for (int i = 0; i < t; i++) {
            String input = br.readLine();

            for (int j = 0; j < t; j++) {
                arr[i][j] = input.charAt(j) == '.';
            }

        }

        for (int i = 0; i < t; i++) {
            int sumRow = 0;
            // 가로 확인
            for (int j = 0; j < t; j++) {
                if (arr[i][j]) {
                    sumRow++;
                } else {
                    if (sumRow >= 2) {
                        row++;
                    }
                    sumRow = 0;
                }


            }
            if (sumRow >= 2) {
                row++;
            }

            int sumCol = 0;
            // 세로 확인
            for (int j = 0; j < t; j++) {
                if (arr[j][i]) {
                    sumCol++;
                } else {
                    if (sumCol >= 2) {
                        col++;
                    }
                    sumCol = 0;
                }

            }
            if (sumCol >= 2) {
                col++;
            }


        }
        System.out.print(row + " " + col);


    }
}
