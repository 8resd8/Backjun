package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NM3_15651 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        ArrayList<Integer> temp = new ArrayList<>();
        permutation(temp);
    }

/*
    중복을 허용하는 모든 경우의 수
    visited는 사용하지 않는다.

    [핵심]
    1. 종료조건 tmep.size() == M
    2. 리스트 줄이는 조건 temp.remove(temp.size() - 1))
*/

    private static void permutation(ArrayList<Integer> temp) {
        if (temp.size() == M) {
            StringBuilder sb = new StringBuilder();
            for (int number : temp) {
                sb.append(number).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = 1; i <= N; i++) {
            temp.add(i);
            permutation(temp);
            temp.remove(temp.size() - 1);
        }
    }
}