package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/24481

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색3_24481 {
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static int[] depth;
    static int N, M, R, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드
        M = Integer.parseInt(st.nextToken()); // 간선
        R = Integer.parseInt(st.nextToken()); // 시작 노드
        adj = new ArrayList<>();
        visited = new boolean[N + 1];
        depth = new int[N + 1];
        Arrays.fill(depth, -1);


        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        for (ArrayList<Integer> ad : adj) {
            Collections.sort(ad);
        }

        dfs(R, 0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            sb.append(depth[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void dfs(int index, int count) {
        depth[index] = count;
        visited[index] = true;

        for (Integer next : adj.get(index)) {
            if (visited[next]) continue;
            dfs(next, count + 1);
        }

    }
}