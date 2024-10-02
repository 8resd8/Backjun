package 입출력과사칙연산.src.Backjoon.gold.g4;

// https://www.acmicpc.net/problem/6497

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 전력난_6497 {
    static class Edge implements Comparable<Edge> {
        int start, end, cost;

        Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static int N, M;
    static int[] parent;
    static PriorityQueue<Edge> pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if (N + M == 0) break;

            pq = new PriorityQueue<>();
            parent = new int[N + 1];
            for (int i = 0; i < N + 1; i++) {
                parent[i] = i;
            }

            int totalCost = 0;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                pq.add(new Edge(start, end, cost));
                totalCost += cost;
            }

            int cost = 0;
            int count = 0;
            while (!pq.isEmpty() && count < N) {
                Edge cur = pq.poll();
                if (find(cur.start) != find(cur.end)) {
                    union(cur.start, cur.end);
                    cost += cur.cost;
                    count++;
                }
            }
            sb.append(totalCost - cost).append("\n");
        }
        System.out.print(sb);
    }

    private static void union(int a, int b) {
        if (a != parent[a])
            a = find(a);
        if (b != parent[b])
            b = find(b);

        parent[b] = a;
    }

    private static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }
}