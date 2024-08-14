package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/1697

public class 숨바꼭질_1697 {
    static int[] arr = new int[100001];
    static int[] visited = new int[100001];
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = NK[0];
        K = NK[1];

        System.out.println(bfs(N));
    }

    private static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int value = queue.poll();

            int[] info = new int[]{value - 1, value + 1, value * 2};
            for (int i : info) {
                if (i >= 0 && i <= 100000 && visited[i] == 0) { // 방문 안한곳
                    visited[i] = visited[value] + 1;
                    arr[i] = visited[i];
                    queue.add(i);

                    if (i == K) return arr[i] - 1;
                }
            }
        }

        return visited[start] - 1;
    }
}