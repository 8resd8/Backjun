package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int num = Character.getNumericValue(input.charAt(i));
            String a = Integer.toBinaryString(num);
            if (i != 0 && a.length() < 3) {
                sb.append("0".repeat(3 - a.length()));
            }
            sb.append(a);
        }
        System.out.println(sb);


    }
}