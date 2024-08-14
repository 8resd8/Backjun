package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;
            boolean isCheck = true;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    isCheck = false;
                }
            }
            if (isCheck) System.out.println("yes");
            else System.out.println("no");
        }


    }
}
