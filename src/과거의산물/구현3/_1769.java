package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;

        while (input.length() > 1) {
            int number = 0;
            for (char c : input.toCharArray()) {
                number += Character.getNumericValue(c);
            }
            count++;
            input = String.valueOf(number);
        }


        System.out.println(count);
        System.out.println(Integer.parseInt(input) % 3 == 0 ? "YES" : "NO");
    }
}