package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/15726

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이칙연산_15726 {
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(st.nextToken());

        int one = (int) ((a * b) / c);
        int two = (int) ((a / b) * c);

        System.out.println(Math.max(one, two));
    }
}
