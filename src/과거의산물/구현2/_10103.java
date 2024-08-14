package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int player1 = 100;
        int player2 = 100;

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            int player1Dice = Integer.parseInt(inputs[0]);
            int player2Dice = Integer.parseInt(inputs[1]);

            // 같은 숫자가 나온 경우 패스
            if (player1Dice == player2Dice) {
                continue;
            }
            // 점수에 따른 값 감소
            if (player1Dice < player2Dice) {
                player1 -= player2Dice;
            } else {
                player2 -= player1Dice;
            }
        }
        System.out.println(player1);
        System.out.println(player2);


    }
}