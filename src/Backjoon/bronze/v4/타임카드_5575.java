package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/5575

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 타임카드_5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[3][6];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int go = a[i][0] * 3600 + a[i][1] * 60 + a[i][2];
            int back = a[i][3] * 3600 + a[i][4] * 60 + a[i][5];
            int time = back - go;

            int hour = time / 3600;
            time %= 3600;
            int minute = time / 60;
            time %= 60;
            int second = time;
            sb.append(hour).append(" ").append(minute).append(" ").append(second).append("\n");
        }

        System.out.print(sb);
    }
}
