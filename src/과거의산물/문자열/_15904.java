package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String UCPC = "UCPC";
        String result = "";
        int start = 0;

        for (char c : input.toCharArray()) {
            for (int j = 0; j < UCPC.length(); j++) {
                if (start > 3) {
                    break;
                }

                if (c == UCPC.charAt(start)) {
                    result += UCPC.charAt(start++);
                    break;
                }
            }
        }


        if (result.equals("UCPC")) System.out.println("I love UCPC");
        else System.out.println("I hate UCPC");
    }
}