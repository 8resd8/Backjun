package Backjoon.gold.g2;

// https://www.acmicpc.net/problem/12015

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열2_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        int[] lis = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int e = 0;
        for (int i = 0; i < n; i++) {
            int index = binary(lis, 0, e - 1, input[i]);
            lis[index] = input[i];
            if (index == e) e++;

        }

        System.out.println(e);
    }

    private static int binary(int[] lis, int s, int e, int key) {
        while (s <= e) {
            int mid = (s + e) / 2;
            if (lis[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s;
    }
}