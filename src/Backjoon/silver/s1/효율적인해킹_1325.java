package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/1325

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 효율적인해킹_1325 {
    static int N, M, count, max;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        dist = new int[N + 1];
        adj = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b);
        }

        for (int i = 1; i < N + 1; i++) {
            Arrays.fill(visited, false);
            count = 0;
            visited[i] = true;
            dfs(i);
            dist[i] = count;
        }

        StringBuilder sb = new StringBuilder(br.readLine());
        for (int i : dist) {
            if (i == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static void dfs(int index) {
        count++;
        max = Math.max(max, count);

        for (Integer next : adj.get(index)) {
            if (visited[next]) continue;
            visited[next] = true;
            dfs(next);
        }
    }
}