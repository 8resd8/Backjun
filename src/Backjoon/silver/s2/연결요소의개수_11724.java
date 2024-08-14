package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// https://www.acmicpc.net/problem/11724

public class 연결요소의개수_11724 {
    static int[] visited;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 인접 행렬 초기화
        int N = nm[0];
        int M = nm[1];

        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }
        // 방문 함수 초기화
        visited = new int[N + 1];

        // n만큼 반복
        for (int i = 0; i < M; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adj.get(input[0]).add(input[1]);
            adj.get(input[1]).add(input[0]);
        }

        int count = 0;
        for (int start = 1; start < visited.length; start++) {
            if (visited[start] == 0) {
                bfs(start);
                count++;
            }
        }


        System.out.println(count);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer i : adj.get(node)) {
                if (visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
}