package A알아두면좋을만한것들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int c = Integer.parseInt(input[0]); // 가로7
        int r = Integer.parseInt(input[1]); // 세로6
        int k = Integer.parseInt(br.readLine());

        if (k > c * r) {
            System.out.println(0);
            return;
        }

        int[][] map = new int[r][c];
        int value = 1;
        int[] dRow = {-1, 0, 1, 0}; // 세로방향
        int[] dCol = {0, 1, 0, -1}; // 가로방향
        int direction = 0; // 0: 위, 1: 오른쪽 2: 아래 3: 왼쪽
        int row = r - 1;
        int col = 0;
        int x = 0;
        int y = 0;

        while (value <= c * r) {
            map[row][col] = value;
            if (value == k) {
                x = r - row;
                y = col + 1;
            }
            value++;

            int nextRow = row + dRow[direction];
            int nextCol = col + dCol[direction];

            if (nextRow < 0 || nextRow >= r || nextCol < 0 || nextCol >= c || map[nextRow][nextCol] != 0) {
                direction = (direction + 1) % 4;
                nextRow = row + dRow[direction];
                nextCol = col + dCol[direction];
            }

            row = nextRow;
            col = nextCol;


        }


        System.out.print(y + " " + x);
    }
}