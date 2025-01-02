package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/11282

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한글_11282 {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println((char) ('가' + n - 1));
    }
}
