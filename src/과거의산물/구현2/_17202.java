package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }

        String number = sb.toString();

        while (number.length() > 2) {
            StringBuilder sbb = new StringBuilder();
            for (int i = 0; i < number.length() - 1; i++) {
                int sum = (number.charAt(i) - '0') + (number.charAt(i + 1) - '0');
                sbb.append(sum % 10);
            }
            number = sbb.toString();
        }


        System.out.println(number);


    }
}