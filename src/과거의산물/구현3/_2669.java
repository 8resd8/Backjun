package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 왼쪽아래 x좌표, 오른쪽 위 y좌표
        // (1, 2), (4, 4) 가로 1 ~ 4 세로 2 ~ 4
        // (2, 3), (5, 7)
        // (3, 1), (6, 5)
        // (7, 3), (8, 6)

        boolean[][] square = new boolean[101][101];
        int answer = 0;

        for (int i = 0; i < 4; i++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int x2 = Integer.parseInt(input[1]);
            int y1 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);


            for (int j = x2; j < y2; j++) {
                for (int k = x1; k < y1; k++) {
                    if (!square[j][k]) {
                        answer++;
                        square[j][k] = true;
                    }
                }
            }
        }


        System.out.println(answer);
    }
}