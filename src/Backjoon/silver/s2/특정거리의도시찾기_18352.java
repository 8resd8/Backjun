package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/18352

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특정거리의도시찾기_18352 {
    static int N, M, K, X;
    static ArrayList<ArrayList<Integer>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점
        M = Integer.parseInt(st.nextToken()); // 간선
        K = Integer.parseInt(st.nextToken()); // 거리값
        X = Integer.parseInt(st.nextToken()); // 출발 번호
        adj = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj.get(start).add(end);
        }

        bfs();
    }

    private static void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(X);
        int[] visited = new int[N + 1];
        Arrays.fill(visited, -1);
        visited[X] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (visited[cur] == K) {
                for (int i = 1; i < N + 1; i++) {
                    if (visited[i] == K) System.out.println(i);
                }
                return;
            }

            for (Integer next : adj.get(cur)) {
                if (visited[next] != -1) continue;
                visited[next] = visited[cur] + 1;
                queue.add(next);
            }
        }

        System.out.println(-1);
    }
}