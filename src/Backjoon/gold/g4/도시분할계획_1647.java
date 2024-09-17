package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 도시분할계획_1647 {
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

    static int N, M, removeEdge;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        makeSet();
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            pq.add(new Edge(start, end, cost));
        }

//        System.out.println(kruskal(pq) - removeEdge);
        System.out.println(kruskal2(pq));
    }

    private static void makeSet() {
        parent = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }
    }

    // Version1.
    // 최대 크기를 따로 저장해서 마지막에 빼기
    private static long kruskal(PriorityQueue<Edge> pq) {
        long cost = 0;
        int maxEdge = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            if (union(cur.start, cur.end)) {
                cost += cur.cost;
                maxEdge = Math.max(maxEdge, cur.cost);
            }
        }
        removeEdge = maxEdge; // 연결된 것중에서 가장 큰 비용을 제거하면 된다.
        return cost;
    }

    // Version2.
    // 우선순위 큐의 특징에 따라 큐가 빌 때까지가 아니라
    // 큐를 1개 남기고 종료하면 된다.
    private static long kruskal2(PriorityQueue<Edge> pq) {
        long cost = 0;
        int size = pq.size() - 1;
        for (int i = 0; i < size; i++) {
            Edge cur = pq.poll();
            if (union(cur.start, cur.end)) {
                cost += cur.cost;
            }
        }
        return cost;
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
}