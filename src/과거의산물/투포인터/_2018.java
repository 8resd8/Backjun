package 과거의산물.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2018
public class _2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int left = 1;
        int count = 0;
        int sum = 0;
        int lastStart = 1;
//        List<Integer> values = new ArrayList<>();

        while (lastStart <= n) {
            sum += left;
//            values.add(left);

            if (sum == n) {
                count++;
                sum = 0;
                left = ++lastStart;

//                System.out.print("길이: " + values.size() + ", ");
//                for (Integer value : values) {
//                    System.out.print(value + " ");
//                }
//                System.out.println();
//                values.clear();
            } else if (sum > n) {
                sum = 0;
                left = ++lastStart;
//                values.clear();
            } else {
                left++;
            }

        }
        System.out.println(count);


    }
}
