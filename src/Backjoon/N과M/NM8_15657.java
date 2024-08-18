package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15657

public class NM8_15657 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        combination(0, numbers, new ArrayList<Integer>());

    }

    private static void combination(int index, int[] numbers, ArrayList<Integer> temp) {
        if (temp.size() == M) {
            StringBuilder sb = new StringBuilder();
            for (Integer num : temp) {
                sb.append(num).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = index; i < N; i++) {
            temp.add(numbers[i]);
            combination(i, numbers, temp);
            temp.remove(temp.size() - 1);
        }
    }


}