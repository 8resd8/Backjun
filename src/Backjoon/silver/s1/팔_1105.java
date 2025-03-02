package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/1105

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 팔_1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String L = st.nextToken();
        String R = st.nextToken();
        int count = 0;

        // 같은 자리수
        if (L.length() != R.length()) {
            System.out.println(count);
            return;
        }

        // 다른 자리수
        for (int i = 0; i < L.length(); i++) {
            if (L.charAt(i) != R.charAt(i)) break;
            if (L.charAt(i) == '8') count++;
        }

        System.out.println(count);
    }
}
