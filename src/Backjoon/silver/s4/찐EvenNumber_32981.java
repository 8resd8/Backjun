package Backjoon.silver.s4;

// https://www.acmicpc.net/problem/32981

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 찐EvenNumber_32981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int mod = (int) Math.pow(10, 9) + 7;

        long[] arr = new long[10000001];
        arr[1] = 5; // ???
        arr[2] = 20; // ???

        for (int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i - 1] * 5) % mod;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]).append("\n");
        }

        System.out.print(sb);
    }
}
