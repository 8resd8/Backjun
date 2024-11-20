package Backjoon.bronze;

// https://www.acmicpc.net/problem/5533

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 유니크_5553 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] user = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                user[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] answer = new int[n];

        for (int i = 0; i < 3; i++) {
            HashMap<Integer, Integer> scoreMap = new HashMap<>();

            for (int j = 0; j < n; j++) {
                scoreMap.put(user[j][i], scoreMap.getOrDefault(user[j][i], 0) + 1);
            }

            for (int j = 0; j < n; j++) {
                if (scoreMap.get(user[j][i]) == 1) {
                    answer[j] += user[j][i];
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
