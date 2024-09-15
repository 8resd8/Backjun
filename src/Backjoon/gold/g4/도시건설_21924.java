package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
     https://www.acmicpc.net/problem/21924
     최소 스패닝 트리 - kruskal (크루스칼) 알고리즘
     Edge + Union-Find + PriorityQueue
 */

public class 도시건설_21924 {
    static class Edge implements Comparable<Edge> {
        int start, end, cost;

        public Edge(int start, int end, int cost) {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점
        M = Integer.parseInt(st.nextToken()); // 간선
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        long totalCost = 0; // 모든 도로의 비용, 최대 1000억
        makeSet();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            totalCost += cost;
            pq.add(new Edge(start, end, cost));
        }


        System.out.println(kruskal(pq, totalCost));
    }

    private static long kruskal(PriorityQueue<Edge> pq, long totalCost) {
        long minCost = 0;
        int count = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            // 연결이 가능하다면 count증가, 비용합산
            if (union(cur.start, cur.end)) {
                minCost += cur.cost;
                count++;
            }
        }

        return count == N - 1 ? (totalCost - minCost) : -1; // 모든 간선의 연결: N-1
    }

    private static boolean union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return false;
        parent[b] = a;
        return true;
    }

    private static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }

    private static void makeSet() { // 루트노드 초기화
        parent = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }
    }
}