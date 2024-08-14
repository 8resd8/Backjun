package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/15649

public class NM1_15649 {
    static int[] visited;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        ArrayList<Integer> temp = new ArrayList<>();
        visited = new int[N + 1];

        permutation(temp);
        System.out.print(sb);
    }

    private static void permutation(ArrayList<Integer> temp) {
        if (temp.size() == M) {
            for (Integer number : temp) {
                sb.append(number).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            temp.add(i);

            permutation(temp);

            visited[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }
}