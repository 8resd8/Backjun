package Backjoon.gold.g5;

// https://www.acmicpc.net/problem/20168

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 골목대장호석_20168 {
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

    static int N, M, A, B, C;
    static int minSuchi;
    static ArrayList<ArrayList<Edge>> adj;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());


        adj = new ArrayList<>();
        dist = new int[N + 1];
        minSuchi = Integer.MAX_VALUE;

        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adj.get(start).add(new Edge(end, cost));
            adj.get(end).add(new Edge(start, cost));
        }

        deikstra();
        System.out.println(Arrays.toString(dist));
        System.out.println("minSuchi = " + minSuchi);


        System.out.println(dist[B] == Integer.MAX_VALUE ? -1 : minSuchi);
    }

    private static void deikstra() {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        Arrays.fill(dist, Integer.MAX_VALUE);
        pq.add(new Edge(A, 0));
        dist[A] = 0;
        // 돈은 다 써도되고 수치심이 가장 적은 길로 가고싶다.

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            if (dist[cur.end] < cur.cost) continue;

            for (Edge next : adj.get(cur.end)) {
                int curCost = next.cost + cur.cost;

                if (dist[next.end] > curCost && C >= curCost) {
                    dist[next.end] = next.cost + cur.cost;
                    minSuchi = Math.min(minSuchi, cur.cost);
                    pq.add(new Edge(next.end, dist[next.end]));
                }
            }
        }
    }
}
