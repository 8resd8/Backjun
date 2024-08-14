package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1526 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 4; i <= n; i++) {
            String value = String.valueOf(i);
            boolean fourAndSeven = true;
            for (char s : value.toCharArray()) {
                int num = Character.getNumericValue(s);
                if (num != 4 && num != 7) {
                    fourAndSeven = false;
                }
            }
            if (fourAndSeven) result = i;
        }


        System.out.println(result);
    }


}