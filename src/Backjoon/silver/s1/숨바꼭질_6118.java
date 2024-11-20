package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/6118

public class 숨바꼭질_6118 {
    static int n, m, max;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new int[n + 1];
        Arrays.fill(visited, -1);

        adj = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        bfs(1);
        int count = 0;
        int index = 20000;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == max) {
                count++;
                index = Math.min(index, i);
            }
        }

        System.out.println(index + " " + max + " " + count);
    }

    private static void bfs(int start) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{start, 0});
        visited[start] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int dist = cur[1];
            max = Math.max(max, visited[x]);

            for (Integer next : adj.get(x)) {
                if (visited[next] >= 0) continue;

                visited[next] = visited[x] + 1;
                q.add(new int[]{next, dist + 1});
            }
        }
    }
}
