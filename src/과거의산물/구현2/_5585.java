package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 1000 - Integer.parseInt(br.readLine());
        int[] moneys = {500, 100, 50, 10, 5, 1};

        int wallet = 0;
        for (int money : moneys) {
            wallet += input / money;
            input %= money;
            if (input == 0) break;
        }
        System.out.println(wallet);

    }
}