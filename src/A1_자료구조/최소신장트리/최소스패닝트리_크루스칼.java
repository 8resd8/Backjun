package A1_자료구조.최소신장트리;

// https://www.acmicpc.net/problem/1197

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// a -> b 를 c비용만큼 연결
// 가장 적은 비용으로 연결하는 방법을 구하기
// 사이클 발생X, 가장 적은 비용으로 연결해야함. (비용기준 정렬)

public class 최소스패닝트리_크루스칼 {
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
    static PriorityQueue<Edge> pq;
    static int V, E;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] VE = br.readLine().split(" ");
        V = Integer.parseInt(VE[0]); // 노드
        E = Integer.parseInt(VE[1]); // 간선
        pq = new PriorityQueue<>();
        makeSet();

        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            pq.add(new Edge(start, end, cost));
        }

        int minCost = 0;
        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            if (union(cur.start, cur.end)) {
                minCost += cur.cost;
            }
        }

        System.out.println(minCost);
    }

    private static void makeSet() {
        parent = new int[V + 1];
        for (int i = 0; i < V + 1; i++) {
            parent[i] = i;
        }
    }

    static boolean union(int a, int b) {
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

/*
3 3
1 2 1
2 3 2
1 3 3

answer: 3

10 21
1 2 3
1 4 6
1 5 9
2 3 2
2 4 4
2 5 9
2 6 9
3 4 2
3 6 8
3 7 9
4 7 9
5 6 8
5 10 18
6 7 7
6 9 9
6 10 10
7 8 4
7 9 5
8 9 1
8 10 4
9 10 3

answer: 38
*/
