package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NM11_15665 {
    static int N, M;
    static int[] numbers;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        numbers = new int[N];
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        dfs(new ArrayList<>());
        System.out.print(sb);
    }

    private static void dfs(ArrayList<Integer> temp) {
        if (temp.size() == M) {
            for (Integer i : temp) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        int pre = -1;
        for (int i = 0; i < N; i++) {
            if (numbers[i] == pre) continue;
            pre = numbers[i];
            temp.add(numbers[i]);

            dfs(temp);

            temp.remove(temp.size() - 1);
        }
    }
}