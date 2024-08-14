package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 30의 배수 = 각 자리의 합이 3의 배수 && 0 보유
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        boolean hasZero = false;
        for (char c : input.toCharArray()) {
            int number = c - '0';
            sum += number;
            list.add(number);

            // 0이 있음을 확인
            if (number == 0) {
                hasZero = true;
            }
        }
        list.sort(Collections.reverseOrder());

        if (sum % 3 == 0 && hasZero) {
            for (int i : list) {
                System.out.print(i);
            }
        } else {
            System.out.println(-1);
        }


        // 30 60 90 120 150 180 210 240 270 300
    }
}