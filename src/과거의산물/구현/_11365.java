package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("END")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(input.length() - 1 - i));
            }
            System.out.println();
        }

    }
}
