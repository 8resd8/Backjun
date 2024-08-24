package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1182

public class 부분수열의합_1182 {
    static int N, S, count;
    static ArrayList<Integer> numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NS = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(NS[0]);
        S = Integer.parseInt(NS[1]);
        numbers = new ArrayList<>();
        while (st.hasMoreTokens()) numbers.add(Integer.parseInt(st.nextToken()));

//        permutation(0, new ArrayList<Integer>());
        permutation2(0, 0);
        System.out.println(count);
    }

    private static void permutation2(int index, int sum) {
        if (sum == S && index > 0) {
            count++;
        }

        for (int i = index; i < N; i++) {
            permutation2(i + 1, sum + numbers.get(i));
        }
    }

}