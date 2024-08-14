package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                } else {
                    if (sb.length() > 0) list.add(sb.toString());
                    sb.setLength(0);
                }
            }

            if (!sb.isEmpty()) list.add(sb.toString());
        }

        List<BigInteger> answer = new ArrayList<>();
        for (String string : list) {
            answer.add(new BigInteger(string));
        }
        Collections.sort(answer);
        for (BigInteger bigInteger : answer) {
            System.out.println(bigInteger);
        }
    }
}