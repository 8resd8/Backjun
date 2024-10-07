package Backjoon.bronze;

// https://www.acmicpc.net/problem/1145

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 적어도대부분의배수_1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 4 ~ 100*99*98까지 [0] ~ [4] 까지 % == 0이면 된다
        int start = 4;
        while (start <= 100 * 99 * 98) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (start % arr[i] == 0) {
                    count++;
                }
            }


            if (count == 3) {
                break;
            }
            start++;
        }

        System.out.println(start);

    }
}