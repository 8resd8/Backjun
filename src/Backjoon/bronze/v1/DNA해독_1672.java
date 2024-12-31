package Backjoon.bronze.v1;

// https://www.acmicpc.net/problem/1672

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DNA해독_1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        char[][] chart = {
                {'A', 'C', 'A', 'G'}, // A
                {'C', 'G', 'T', 'A'}, // G
                {'A', 'T', 'C', 'G'}, // C
                {'G', 'A', 'G', 'T'}  // T
        };

        Map<Character, Integer> dnaIndex = new HashMap<>();
        dnaIndex.put('A', 0);
        dnaIndex.put('G', 1);
        dnaIndex.put('C', 2);
        dnaIndex.put('T', 3);

        char[] dna = input.toCharArray();
        for (int i = N - 1; i > 0; i--) {
            int idx1 = dnaIndex.get(dna[i - 1]); // 앞 문자
            int idx2 = dnaIndex.get(dna[i]);     // 뒷 문자
            dna[i - 1] = chart[idx1][idx2];      // 결과를 앞 문자 위치에 저장
        }

        System.out.println(dna[0]);
    }
}