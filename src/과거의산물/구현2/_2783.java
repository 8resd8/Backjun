package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2783 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ROLE_1000_GRAM = 1000;
        String[] input = br.readLine().split(" ");
        double min1000 = ROLE_1000_GRAM / Double.parseDouble(input[1]) * Double.parseDouble(input[0]);

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            min1000 = Math.min(min1000, (ROLE_1000_GRAM / Double.parseDouble(input[1])) * Double.parseDouble(input[0]));
        }
        System.out.printf("%.2f", min1000);


    }


}