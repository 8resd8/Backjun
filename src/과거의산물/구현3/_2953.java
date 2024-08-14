package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String winnerName = "";
        int winnerScore = 0;
        for (int i = 1; i <= 5; i++) {
            String[] input = br.readLine().split(" ");
            int sum = 0;
            for (String s : input) {
                int number = Integer.parseInt(s);
                sum += number;
            }

            if (winnerScore < sum) {
                winnerName = String.valueOf(i);
                winnerScore = sum;
            }
        }

        System.out.print(winnerName + " " + winnerScore);


    }
}
