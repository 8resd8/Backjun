package Backjoon.bronze;

// https://www.acmicpc.net/problem/1296

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팀이름정하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yName = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String team = "";

        int max = -1;
        for (int i = 0; i < n; i++) {
            int[] alpha = new int[26];
            for (char c : yName.toCharArray()) {
                alpha[c - 'A']++;
            }

            String name = br.readLine();
            for (char c : name.toCharArray()) {
                alpha[c - 'A']++;
            }

            int L = alpha['L' - 'A'];
            int O = alpha['O' - 'A'];
            int V = alpha['V' - 'A'];
            int E = alpha['E' - 'A'];

            int point = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
            if (max < point || (max == point && team.compareTo(name) > 0)) {
                max = point;
                team = name;
            }
        }
        System.out.println(team);

    }
}