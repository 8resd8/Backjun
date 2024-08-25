package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/7490

public class _0만들기7490 {
    private static int N;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
        int T = 1;
        for (int tc = 0; tc < T; tc++) {
//            N = Integer.parseInt(br.readLine());
            N = 7;

            sb = new StringBuilder();
            permutation(0, 1, new ArrayList<Character>());
//            System.out.println(sb);
        }
    }

    private static void permutation(int index, int sum, ArrayList<Character> temp) {
        if (temp.size() == N - 1) {
            System.out.println(temp);
            sb = new StringBuilder().append(1);
            sum = 1;
            for (int i = 1; i < N; i++) {
                if (temp.get(i - 1) == '+') {
                    sum += (i + 1);
                    sb.append('+').append(i+1);
                } else if (temp.get(i - 1) == '-') {
                    sum -= (i + 1);
                    sb.append('-').append(i + 1);
                } else if (i < N - 1 && temp.get(i - 1) == ' '){ // 공백의 경우
                    sum = Integer.parseInt(String.valueOf(sum) + (i + 1));
                    sb.append(' ').append(i + 1);
                }
            }
//            if (sum == 0) {
//                System.out.println(sb);
//            }
            return;
        }

        for (int i = index; i < N - 1; i++) {
            // + - ' '의 조합을 만들어야해.
            temp.add('+');
            permutation(i + 1, 0, temp);
            temp.remove(temp.size() - 1);

            temp.add('-');
            permutation(i + 1, 0, temp);
            temp.remove(temp.size() - 1);

            temp.add(' ');
            permutation(i + 1, 0, temp);
            temp.remove(temp.size() - 1);

        }
    }
}
