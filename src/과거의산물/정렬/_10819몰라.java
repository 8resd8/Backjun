package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://www.acmicpc.net/problem/10819
public class _10819몰라 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        List<Integer> original = new ArrayList<>();
        for (String s : input) {
            int number = Integer.parseInt(s);
            original.add(number);
        }
        Collections.sort(original);

        for (Integer i : original) {
            System.out.print(i + " ");
        }
        System.out.println();

        // |A[0] - A[1]| + |A[1] - A[2]| + ... + |A[N-2] - A[N-1]|
        // 순서를 바꿔서 식의 최댓값을 구해라...


    }
}