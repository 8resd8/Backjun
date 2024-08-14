package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int min = 100;
            int sum = 0;
            for (String s : input) {
                int number = Integer.parseInt(s);
                if (number % 2 == 0) {
                    sum += number;
                    min = Math.min(min, number);
                }

            }
            System.out.print(sum + " " + min + "\n");
        }

    }
}