package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/24484

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색6_24484 {
    static int N, M, R, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static int[] arr, arr1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        visited = new boolean[N + 1];
        arr = new int[N + 1];
        arr1 = new int[N + 1];
        count = 1;
        Arrays.fill(arr, -1);

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

        // 오름차순 방문
        for (ArrayList<Integer> a : adj) {
            Collections.sort(a, Collections.reverseOrder());
        }

        visited[R] = true;
        dfs(R, 0);

        long answer = 0;
        for (int i = 1; i < N + 1; i++) {
            answer += (long) arr[i] * arr1[i];
        }

        System.out.println(answer);
    }

    private static void dfs(int d, int c) {
        arr[d] = count++;
        arr1[d] = c;

        for (Integer next : adj.get(d)) {
            if (visited[next]) continue;
            visited[next] = true;
            dfs(next, c + 1);
        }

    }
}
