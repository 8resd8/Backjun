package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15663

public class NM9_15663 {
    static int N, M;
    static int[] numbers;
    static boolean[] visited;
    //    static ArrayList<ArrayList<Integer>> result; // 방법 1
//    static Set<String> result;
    static ArrayList<String> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        numbers = new int[N];
        visited = new boolean[N];
//        result = new ArrayList<>();
//        result = new TreeSet<>();
        result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        permutation(0, new ArrayList<>());

        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }

    private static void permutation(int index, ArrayList<Integer> temp) {
        if (index == M) {
            StringBuilder sb = new StringBuilder();
            for (Integer integer : temp) {
                sb.append(integer).append(" ");
            }
            result.add(sb.toString());
            return;
        }

        int lastUsed = -1; // 이번 호출에서 사용한 마지막 수
        for (int i = 0; i < N; i++) {
//            if (visited[i] || lastUsed == numbers[i]) continue;
            if (visited[i]) continue;
            visited[i] = true;
            temp.add(numbers[i]);
            lastUsed = numbers[i]; // 마지막 사용한 수

            permutation(index + 1, temp);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}