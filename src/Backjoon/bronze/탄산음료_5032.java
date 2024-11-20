package Backjoon.bronze;

// https://www.acmicpc.net/problem/5032

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 탄산음료_5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken()); // 빈 병의 수
        int f = Integer.parseInt(st.nextToken()); // 발견한 빈 병
        int c = Integer.parseInt(st.nextToken()); // 새 병으로 바꿔야 할 병의 개수
        int answer = 0;
        e += f;
        while (e >= c) {
            answer += e / c;

            int divide = e / c;
            e %= c;
            e += divide;
        }

        System.out.println(answer);
    }
}
