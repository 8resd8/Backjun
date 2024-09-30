package 입출력과사칙연산.src.Backjoon.gold.g3;

// https://www.acmicpc.net/problem/4386

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 별자리만들기_4386 {
    static class Edge implements Comparable<Edge> {
        double start, end, cost;

        public Edge(double start, double end, double cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Double.compare(cost, o.cost);
        }
    }
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double start = Double.parseDouble(st.nextToken());
            double end = Double.parseDouble(st.nextToken());

        }
    }
}