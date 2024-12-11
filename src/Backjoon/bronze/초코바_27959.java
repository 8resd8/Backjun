package Backjoon.bronze;

// https://www.acmicpc.net/problem/27959

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 초코바_27959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(st.nextToken()) * 100 >= Integer.parseInt(st.nextToken()) ? "Yes" : "No");
    }
}
