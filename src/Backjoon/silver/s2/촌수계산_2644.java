package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 촌수계산_2644 {
    static int[] visited;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); // int[][]

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] start = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i <= t; i++) {
            adj.add(new ArrayList<>());
        }
        visited = new int[t + 1];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            adj.get(input[0]).add(input[1]);
            adj.get(input[1]).add(input[0]);
        }
        bfs(start);

        System.out.println(visited[start[1]] == 0 ? -1 : (visited[start[1]] - 1));

    }

    private static void bfs(int[] start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start[0]);
        visited[start[0]] = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer i : adj.get(node)) {
                if (visited[i] == 0) {
                    queue.add(i);
                    visited[i] = visited[node] + 1;
                }
            }


        }
    }
}