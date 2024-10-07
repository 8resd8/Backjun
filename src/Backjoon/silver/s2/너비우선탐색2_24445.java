package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색2_24445 {
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            adj.get(s).add(e);
            adj.get(e).add(s); // 양방향
        }

        for (ArrayList<Integer> in : adj) {
            in.sort(Comparator.reverseOrder()); // 내림차순 방문
        }

        int[] answer = bfs();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < answer.length; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static int[] bfs() {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[N + 1];
        q.add(R);
        visited[R] = true;
        int[] visit = new int[N + 1]; // 0번제외, 1 ~ N사용
        int count = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            visit[cur] = ++count;

            for (Integer next : adj.get(cur)) {
                if (visited[next]) continue;
                visited[next] = true;
                q.add(next);
            }
        }
        return visit;
    }
}