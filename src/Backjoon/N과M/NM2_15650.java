package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// // https://www.acmicpc.net/problem/15650

public class NM2_15650 {
    static int[] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        ArrayList<Integer> temp = new ArrayList<>();
        visited = new int[N + 1];

        permutation(temp, 1);
    }

/*
    중복을 허용하지 않는 모든 경우의 수

    [핵심]
    1. 종료 조건
    2. visited로 중복 확인
    3. temp.remove(temp.size() - 1))
    4. i의 값을 변수로 설정하여 start + 1값을 계속 넘겨준다.
*/

    private static void permutation(ArrayList<Integer> temp, int start) {
        if (temp.size() == M) {
            System.out.println(temp);
            return;
        }

        for (int i = start; i <= N; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            temp.add(i);

            permutation(temp, i + 1);

            visited[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }
}
