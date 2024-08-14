package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input == null || input.isBlank()) return;

            int soMunja = 0;
            int daeMunja = 0;
            int number = 0;
            int space = 0;

            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    soMunja++;
                } else if (Character.isUpperCase(c)) {
                    daeMunja++;
                } else if (c == ' ') {
                    space++;
                } else if (Character.isDigit(c)) {
                    number++;
                }
            }

            System.out.print(soMunja + " " + daeMunja + " " + number + " " + space + "\n");
        }


    }


}