package Backjoon.bronze;

// https://www.acmicpc.net/problem/3034

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 앵그리창영_3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = (int) Math.sqrt((in[1]*in[1]) + (in[2]*in[2]));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < in[0]; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input <= length) sb.append("DA");
            else sb.append("NE");
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
