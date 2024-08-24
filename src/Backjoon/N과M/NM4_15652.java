package 입출력과사칙연산.src.Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/15652

public class NM4_15652 {
    static int N, M;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        visited = new int[N + 1];

        ArrayList<Integer> temp = new ArrayList<>();
        // 구현 필요
        permutation(temp, 1);
    }

    // visited를 쓰는 이유: 중복된 숫자를 피하기 위해 사용
    // 1을 고른다.
    // 또 1을 고른다 2, 3, N개 고른다
    // 2를 고른다
    // 또 2를 고른다, 3, N개 고른다
    // ...
    

    private static void permutation(ArrayList<Integer> temp, int start) {
        if (temp.size() == M) {
            StringBuilder sb = new StringBuilder();
            for (Integer number : temp) {
                sb.append(number).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for (int j = start; j <= N; j++) {
            temp.add(j);
            permutation(temp, j);
            temp.remove(temp.size() - 1);
        }

    }
}
