package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            boolean isPossible = true;
            // 0번째는 1번째가 가능한 문자열이냐?

            for (char c : input[0].toCharArray()) {
                if (input[1].contains(String.valueOf(c))) {
                    input[1] = input[1].replaceFirst(String.valueOf(c), "");
                } else {
                    isPossible = false;
                    break;
                }
            }

            System.out.println(input[1].isEmpty() && isPossible ? "Possible" : "Impossible");
        }


    }
}
