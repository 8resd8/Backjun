package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class _2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A);
        int number = A;
        int sum = 0;

        while (true) {
            while (number > 0) {
                sum += (int) Math.pow(number % 10, P);
                number /= 10;
            }
            if (Collections.frequency(list, sum) > 1) {
                break;
            }
            list.add(sum);
            number = sum;
            sum = 0;

        }

        int answer = 0;
        for (Integer integer : list) {
            if (Collections.frequency(list, integer) == 1) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
