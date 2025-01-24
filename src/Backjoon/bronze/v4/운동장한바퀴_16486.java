package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/16486

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 운동장한바퀴_16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // c 가로
        int b = Integer.parseInt(br.readLine()); // a 반지름
        double pie = 3.141592;

        System.out.println(a * 2 + (b * 2 * pie));
    }
}
