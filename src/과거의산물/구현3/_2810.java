package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int cupHolder = 1;
        boolean checkCoupleChair = false;
        for (char c : input.toCharArray()) {
            if (checkCoupleChair) {
                checkCoupleChair = false;
                cupHolder++;
                continue;
            }

            if (c == 'S') {
                cupHolder++;
            } else if (c == 'L') {
                checkCoupleChair = true;
            }
        }

        System.out.println(Math.min(cupHolder, input.length()));
    }
}