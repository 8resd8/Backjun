package 입출력과사칙연산.src.A2_알고리즘.크루스칼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 행성연결_크루스칼_ArrayList {
    static class Edge implements Comparable<Edge> {
        int start, end;
        long cost;

        public Edge(int start, int end, long cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Long.compare(cost, o.cost);
        }
    }

    static ArrayList<Edge> adj;
    static int[][] map;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        adj = new ArrayList<>();
        map = new int[N][N];
        parent = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0) adj.add(new Edge(i, j, map[i][j]));
            }
        }

        Collections.sort(adj);
        System.out.println(kruskal());
    }

    private static long kruskal() {
        long cost = 0;

        for (Edge edge : adj) {
            if (union(edge.start, edge.end)) cost += edge.cost;
        }

        return cost;
    }

    private static boolean union(int start, int end) {
        start = find(start);
        end = find(end);
        if (start == end) return false;
        parent[end] = start;
        return true;
    }

    private static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }
}
