package 과거의산물.삼성DX사전문제;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static Edge[] edges;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testN = sc.nextInt();

        for (int testCase = 1; testCase <= testN; testCase++) {
            N = sc.nextInt();
            M = sc.nextInt();

            edges = new Edge[M];

            for (int i = 0; i < M; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int C = sc.nextInt();

                edges[i] = new Edge(X, Y, C);
            }

            int answer = findCost();
            System.out.println("#" + testCase + " " + answer);
        }
    }

    private static int findCost() {
        int[] minCost = new int[N + 1];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[1] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < M; j++) {
                int from = edges[j].from;
                int to = edges[j].to;
                int cost = edges[j].cost;

                if (minCost[from] != Integer.MAX_VALUE && minCost[from] + cost < minCost[to]) {
                    minCost[to] = minCost[from] + cost;
                }
            }
        }

        return minCost[N] == Integer.MAX_VALUE ? -1 : minCost[N];
    }

    static class Edge {
        int from;
        int to;
        int cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
}
