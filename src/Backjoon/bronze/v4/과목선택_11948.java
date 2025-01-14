package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/11948

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class 과목선택_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sub1 = new ArrayList<>();
        List<Integer> sub2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int number = Integer.parseInt(br.readLine());
            if (i < 4) {
                sub1.add(number);
            } else {
                sub2.add(number);
            }
        }
        sort(sub1, reverseOrder());
        sort(sub2, reverseOrder());

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += sub1.get(i);
        }

        System.out.println(sum + sub2.get(0));
    }
}
