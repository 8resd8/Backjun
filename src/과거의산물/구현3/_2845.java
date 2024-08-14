package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        int cost = L * P;

        input = br.readLine().split(" ");
        for (String s : input) {
            int number = Integer.parseInt(s);
            int calculation = number - cost;
            System.out.print(calculation + " ");
        }

    }
}
