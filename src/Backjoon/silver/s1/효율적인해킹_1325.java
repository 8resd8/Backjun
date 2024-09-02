package Backjoon.silver.s1;

// https://www.acmicpc.net/problem/1325

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 효율적인해킹_1325 {
    static int N, M, maxCount;
    //    static boolean[] visited;
    static int[] visited;
    static ArrayList<ArrayList<Integer>> adj;
//    static ArrayList<Integer> result;
    static int[] result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
//        visited = new boolean[N + 1];
//        result = new ArrayList<>();
        result = new int[N + 1];
        maxCount = 0;
        adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
//            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            visited = new int[N + 1];
            bfs(i);
        }

        int max = 0;
        for (int i =  1; i <= N; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }

        for (int i = 1; i <= N; i++) {
            if (result[i] == max) {
                System.out.print(i + " ");
            }
        }


    }

    private static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (Integer next : adj.get(current)) {
                if (visited[next] != 0) continue;
                visited[next] = visited[start] + 1;
                queue.add(next);
                result[next]++;
            }
        }
    }
}