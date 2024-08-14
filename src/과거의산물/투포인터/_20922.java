package 과거의산물.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// https://www.acmicpc.net/problem/20922
public class _20922 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        int n = Integer.parseInt(NK[0]);
        int k = Integer.parseInt(NK[1]);

        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int right = 0;

        while (right < n) {
            int number = Integer.parseInt(input[right]);
            list.add(number);

            if (Collections.frequency(list, number) > k) {
                right = list.indexOf(number) + 1;
                max = Math.max(max, list.size() - 1);
                list.clear();

            } else if (Collections.frequency(list, number) <= k) {
                right++;
            }


        }
        System.out.println(max);

    }
}
