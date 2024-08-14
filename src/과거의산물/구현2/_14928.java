package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int modValue = 20000303;
        long remainder = 0;

        for (int i = 0; i < input.length(); i++) {
            remainder = (remainder * 10 + (input.charAt(i) - '0')) % modValue;
        }

        System.out.println(remainder);


    }
}