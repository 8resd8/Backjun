package 입출력과사칙연산.src.Backjoon.bronze;

// https://www.acmicpc.net/problem/1032

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] inputs = new String[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            inputs[i] = br.readLine();
            size = inputs[0].length();
        }

        // 세로가 다른값이 1개라도 있다면 ?로 변환
        for (int i = 0; i < size; i++) {
            char c = inputs[0].charAt(i);
            boolean check = true;
            for (int j = 1; j < n; j++) {
                if (c != inputs[j].charAt(i)) {
                    check = false;
                    break;
                }
            }

            if (check) sb.append(c);
            else sb.append("?");
        }
        System.out.println(sb);
    }
}