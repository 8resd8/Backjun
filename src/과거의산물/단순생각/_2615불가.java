package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2615불가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 19;
        int col = 19;
        int[][] maps = new int[col][row];

        // 입력
        for (int i = 0; i < col; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < row; j++) {
                int number = Integer.parseInt(input[j]);
                maps[i][j] = number;
            }
        }


        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (maps[i][j] != 0) {
                    checkWin(maps, i, j);
                }
            }

        }

        System.out.println(0);
    }

    private static int[] checkWin(int[][] maps, int col, int row) {
        int[] answer = new int[2];
        int color = maps[col][row];

        int rowCount = 1;
        int colCount = 1;

        for (int i = 1; i < maps.length; i++) {
            // 연결되는 숫자일때만
            if (isValid(row + i, col) && maps[col][row + i] == color && maps[col][row + i - 1] == color)
                rowCount++; // 오른쪽
            if (isValid(row - i, col) && maps[col][row - i] == color && maps[col][row - i + 1] == color)
                rowCount++; // 왼쪽
            if (isValid(row, col - i) && maps[col - i][row] == color && maps[col - i + 1][row] == color)
                colCount++; // 위
            if (isValid(row, col + i) && maps[col + i][row] == color && maps[col + i - 1][row] == color)
                colCount++; // 아래
        }


        return answer;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < 19 && y < 19;
    }
}