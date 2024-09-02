package Backjoon.gold.g5;

// https://www.acmicpc.net/problem/1916

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최소비용구하기_1916 {
    static int N, M, start, end;
    static ArrayList<ArrayList<Edge>> adj;
    static int[] dist;
    static PriorityQueue<Edge> pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // V
        M = Integer.parseInt(br.readLine()); // E
        pq = new PriorityQueue<>();
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        adj = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adj.get(start).add(new Edge(end, cost));
        }

        String[] startEnd = br.readLine().split(" ");
        start = Integer.parseInt(startEnd[0]);
        end = Integer.parseInt(startEnd[1]);

        dijkstra();
        System.out.println(dist[end]);
    }

    private static void dijkstra() {
        pq.add(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            if (current.cost > dist[current.end]) continue; // 값이 이미 더 큰 경우 필요없음

            for (Edge next : adj.get(current.end)) {
                if (dist[next.end] > current.cost + next.cost) {
                    dist[next.end] = current.cost + next.cost;
                    pq.add(new Edge(next.end, dist[next.end]));
                }
            }
        }
    }

    private static class Edge implements Comparable<Edge>{
        int end, cost;

        public Edge(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(cost, o.cost);
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "end=" + end +
                    ", cost=" + cost +
                    '}';
        }
    }
}