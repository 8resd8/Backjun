package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        if (input == null || input.isEmpty()) {
            System.out.println(0);
            return;
        }

        for (int i = input.length(); i > 0; i-=3) {
            int start = Math.max(0, i - 3); // 0 이상 보장, 3개
            String str = input.substring(start, i); // 3개씩 끊기
            // Integer.parseInt(str, 2) -> 011인경우
            result.append(Integer.toOctalString(Integer.parseInt(str, 2)));
        }


        System.out.println(result.reverse());
    }

}