package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/24444

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색1_24444 {
    static int N, M, R, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        visited = new boolean[N + 1];
        result = new int[N + 1];
        count = 1;

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

        for (ArrayList<Integer> next : adj) {
            Collections.sort(next);
        }

        bfs(R);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N + 1; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[R] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            result[cur] = count++;

            for (int next : adj.get(cur)) {
                if (visited[next]) continue;
                visited[next] = true;
                q.add(next);
            }
        }
    }

}
