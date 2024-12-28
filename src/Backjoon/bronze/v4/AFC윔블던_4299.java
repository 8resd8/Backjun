package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/4299

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AFC윔블던_4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = (a + b) / 2;
        int y = a - x;
        int[] arr = {x, y};
        Arrays.sort(arr);

        if ((a + b) % 2 != 0 || x < 0 || y < 0) {
            System.out.println(-1);
        } else {
            System.out.println(arr[1] + " " + arr[0]);
        }
    }
}
