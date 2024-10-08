package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/15649

public class NM1_15649 {
    static int[] visited;
    static int N, M;
    static private final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }

        permutation(numbers, new ArrayList<Integer>(), new boolean[N]);

    }

    private static void permutation(int[] numbers, ArrayList<Integer> temp, boolean[] visited) {
        if (temp.size() == M) {
            System.out.println(temp);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            temp.add(numbers[i]);

            permutation(numbers, temp, visited);
            visited[i] = false;
            temp.remove(temp.size() - 1);

        }
    }
}