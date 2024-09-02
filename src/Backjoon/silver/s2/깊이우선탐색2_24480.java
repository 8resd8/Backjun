package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색2_24480 {
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> adj;
    static StringTokenizer st;
    static boolean[] visited;
    static int[] arr;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMR = br.readLine().split(" ");
        N = Integer.parseInt(NMR[0]);
        M = Integer.parseInt(NMR[1]);
        R = Integer.parseInt(NMR[2]);
        count = 1;
        arr = new int[N + 1];
        visited = new boolean[N + 1];

        adj = new ArrayList<>();
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
        for (ArrayList<Integer> list : adj) {
            Collections.sort(list, Collections.reverseOrder());
        }

        dfs(R);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void dfs(int current) {
        arr[current] = count++;
        visited[current] = true;

        for (Integer next : adj.get(current)) {
            if (visited[next]) continue;
            dfs(next);
        }
    }

}