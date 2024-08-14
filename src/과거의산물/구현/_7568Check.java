package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7568Check {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);

            board[i][0] = weight;
            board[i][1] = height;
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (board[j][0] > board[i][0] && board[j][1] > board[i][1]) {
                    rank++;
                }
            }

            System.out.printf("%d ", rank);
        }

    }
}
