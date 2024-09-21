package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/1504

public class 특정한최단경로_1504 {
    static class Edge implements Comparable<Edge> {
        int end, cost;

        Edge(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static int N, E;
    static ArrayList<ArrayList<Edge>> adj;
    static int[] dist;
    static boolean cant;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]); // 정점
        E = Integer.parseInt(input[1]); // 간선
        adj = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adj.get(start).add(new Edge(end, cost)); // 방향성이 없다 -> 양방향
            adj.get(end).add(new Edge(start, cost));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int move1 = Integer.parseInt(st.nextToken());
        int move2 = Integer.parseInt(st.nextToken());
        if (move1 == move2) {
            System.out.println(0);
            return;
        }


        // 1 -> move1 -> move2 -> N
        int result0 = dijkstra(1, move1) + dijkstra(move1, move2) + dijkstra(move2, N);
        // 1 -> move2 -> move1 -> N
        int result1 = dijkstra(1, move2) + dijkstra(move2, move1) + dijkstra(move1, N);

        System.out.println(cant ? -1 : Math.min(result0, result1));
//        System.out.println(Math.min(result0, result1) < 0 ? -1 : Math.min(result0, result1));
    }

    static int dijkstra(int start, int end) {
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.add(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            if (dist[cur.end] < cur.cost) continue;

            for (Edge next : adj.get(cur.end)) {
                if (dist[next.end] > cur.cost + next.cost) {
                    dist[next.end] = cur.cost + next.cost;
                    pq.add(new Edge(next.end, dist[next.end]));
                }

            }
        }
        if (dist[end] == Integer.MAX_VALUE) {
            cant = true;
        }
        return dist[end];
    }
}