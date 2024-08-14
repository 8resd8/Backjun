package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            sum = 0;
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    count++;
                }

                if (input.charAt(j) == 'X') {
                    for (int k = 1; k <= count; k++) {
                        sum += k;
                    }
                    count = 0;
                }
            }

            if (input.charAt(input.length() - 1) == 'O') {
                while (count > 0) {
                    sum += count--;
                }
            }

            System.out.println(sum);
        }
        br.close();


    }
}