package 과거의산물.구현2;

import java.io.IOException;
import java.util.Scanner;

public class _2578 {
    static int[][] bingo = new int[5][5]; // 빙고는 공용 사용

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 5 * 5 빙고 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 25; i++) {
            int userNumber = sc.nextInt();
            if (checkBingo(userNumber, bingo)) {
                System.out.println(i + 1);
                return;
            }
        }


    }

    private static boolean checkBingo(int userNumber, int[][] bingo) {
        int bingoCount = 0; // 빙고 개수

        // 숫자의 위치가 어디인지 확인
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                if (userNumber == bingo[i][j]) {
                    bingo[i][j] = 0; // 빙고로 지워진 표시
                    break;
                }
            }
        }

        boolean leftToRight = true;
        boolean rightToLeft = true;
        for (int i = 0; i < 5; i++) {
            boolean colBingo = true;
            boolean rowBingo = true;

            for (int j = 0; j < 5; j++) {
                // 가로: 모든 가로 줄 확인
                if (bingo[i][j] != 0) {
                    rowBingo = false;
                }
                // 세로: 모든 세로 줄 확인
                if (bingo[j][i] != 0) {
                    colBingo = false;
                }
            }
            if (rowBingo) bingoCount++;
            if (colBingo) bingoCount++;

            // 대각선 / 확인
            if (bingo[i][4 - i] != 0) leftToRight = false;

            // 대각선 \ 확인
            if (bingo[i][i] != 0) rightToLeft = false;
        }
        if (leftToRight) bingoCount++;
        if (rightToLeft) bingoCount++;


        return bingoCount >= 3;
    }
}