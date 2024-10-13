package Backjoon.gold.g4;

// https://www.acmicpc.net/problem/14938

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 서강그라운드_14938 {
    static class Edge implements Comparable<Edge> {
        int end, cost;

        public Edge(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static int N, M, R;
    static int[] itemCount;
    static ArrayList<ArrayList<Edge>> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxItem = 0;
        N = Integer.parseInt(st.nextToken()); // 노드 개수
        M = Integer.parseInt(st.nextToken()); // 수색 범위
        R = Integer.parseInt(st.nextToken()); // 길의 개수
        itemCount = new int[N + 1];
        adj = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        // 아이템의 개수
        for (int i = 0; i < N; i++) {
            itemCount[i + 1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adj.get(start).add(new Edge(end, cost));
            adj.get(end).add(new Edge(start, cost));
        }

        for (int i = 1; i <= N; i++) {
            maxItem = Math.max(maxItem, dijkstra(i));
        }
        System.out.println(maxItem);
    }

    private static int dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        pq.add(new Edge(start, 0));
        dist[start] = 0;
        int item = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            if (dist[cur.end] < cur.cost) continue;
            if (cur.cost <= M) item += itemCount[cur.end];

            for (Edge next : adj.get(cur.end)) {
                if (dist[next.end] > cur.cost + next.cost) {
                    dist[next.end] = cur.cost + next.cost;
                    pq.add(new Edge(next.end, dist[next.end]));
                }
            }
        }
        return item;
    }
}