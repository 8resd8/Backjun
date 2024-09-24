package Backjoon.bronze;

// https://www.acmicpc.net/problem/1159

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class 농구경기_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeMap<Character, Integer> firstName = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            firstName.put(input.charAt(0), firstName.getOrDefault(input.charAt(0), 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : firstName.entrySet()) {
            if (entry.getValue() >= 5) {
                sb.append(entry.getKey());
            }
        }

        System.out.println(sb.length() == 0 ? "PREDAJA" : sb);
    }
}