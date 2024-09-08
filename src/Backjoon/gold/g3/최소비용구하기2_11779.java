package Backjoon.gold.g3;

// https://www.acmicpc.net/problem/11779

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최소비용구하기2_11779 {
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

    static int N, M;
    static ArrayList<ArrayList<Edge>> adj;
    static ArrayList<Integer> result;
    static int[] dist, prev;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 정점
        M = Integer.parseInt(br.readLine()); // 간선
        adj = new ArrayList<>();
        result = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adj.get(a).add(new Edge(b, cost));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dijkstra(start, end);

        List<Integer> path = new ArrayList<>();
        for (int i = end; i != -1; i = prev[i]) {
            path.add(i);
        }

        Collections.reverse(path); // 도착지부터 찾아갔으므로 반대로 바꿈
        StringBuilder sb = new StringBuilder().append(dist[end]).append("\n").append(path.size()).append("\n");
        for (Integer i : path) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

    private static void dijkstra(int start, int end) {
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            for (Edge next : adj.get(cur.end)) {
                if (dist[next.end] > cur.cost + next.cost) {
                    dist[next.end] = cur.cost + next.cost;
                    pq.add(new Edge(next.end, dist[next.end]));
                    prev[next.end] = cur.end; // 다음 경로에 가장 마지막에 온사람이 최단거리.
                }
            }
        }
    }
}