package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/13905

/**
 * 꼭 PriorityQueue를 사용하는 것이 아니다.
 * 가장 큰 비용으로만 가야할 때(가장 많은 금빼빼로), 반드시 먼저 가지 않아도 되는 경우의 문제
 */
public class 세부_13905 {
    static class Edge implements Comparable<Edge> {
        int start, end, cost;

        public Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        public int compareTo(Edge o) {
            return Integer.compare(o.cost, cost);
        }
    }

    static int N, M, start, end;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        ArrayList<Edge> list = new ArrayList<>();
        parent = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.add(new Edge(start, end, cost));
        }
        Collections.sort(list);

        int min = Integer.MAX_VALUE;
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            Edge cur = list.get(i);

            if (union(cur.start, cur.end)) {
                min = Math.min(min, cur.cost);
                if (find(start) == find(end)) {
                    check = true;
                    break;
                }
            }
        }

        System.out.println(check ? min : 0); // 도착지에 도착한 경우만 값 출력
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
