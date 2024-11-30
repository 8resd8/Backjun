package Backjoon.silver.s5;

// https://www.acmicpc.net/problem/4158

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CD_4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N + M == 0) break;

            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                int number = Integer.parseInt(br.readLine());
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            for (int i = 0; i < M; i++) {
                int number = Integer.parseInt(br.readLine());
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            for (Integer value : map.values()) {
                if (value >= 2) count++;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
