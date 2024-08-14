package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(i + 1).append(": ");
            for (int j = 0; j < input.length; j++) {
                sb.append(input[input.length - 1 - j]).append(" ");
            }
            System.out.println(sb);
        }


    }
}