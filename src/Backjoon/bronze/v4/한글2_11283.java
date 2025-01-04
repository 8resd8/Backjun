package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/11283

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 한글2_11283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input = br.readLine().charAt(0);

        System.out.println(input - '가' + 1);
    }
}
