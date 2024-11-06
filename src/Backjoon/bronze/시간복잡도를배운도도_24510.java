package 입출력과사칙연산.src.Backjoon.bronze;

// https://www.acmicpc.net/problem/24510

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시간복잡도를배운도도_24510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            int count = 0;
            for (int j = 0; j < s.length(); j++) {

                if (j + 3 <= s.length() && s.substring(j, j + 3).equals("for")) {
                    count++;
                    j += 2;
                } else if (j + 5 <= s.length() && s.substring(j, j + 5).equals("while")) {
                    count++;
                    j += 4;
                }
            }

            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
