package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/11725

public class 트리의부모찾기_11725 {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }
        visited = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adj.get(input[0]).add(input[1]);
            adj.get(input[1]).add(input[0]);
        }

        bfs();
        for (int i = 2; i < visited.length; i++) {
            System.out.println(visited[i]);
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer i : adj.get(node)) {
                if (visited[i] == 0) {
                    queue.add(i);
                    visited[i] = node;
                }
            }
        }
    }

}