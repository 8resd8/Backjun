package Backjoon.gold.g4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/12851

public class 숨바꼭질2_12851 {
    static int[] visited = new int[100001];
    static int N, K;
    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = NK[0];
        K = NK[1];

        bfs();
        System.out.println(visited[K]);
        System.out.println(count);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        if (N == K) {
            count++;
            return;
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();

            int[] info = new int[]{now - 1, now + 1, now * 2};
            for (int next : info) {
                if (next >= 0 && next <= 100000 && (visited[next] == 0 || visited[next] > visited[now])) {
                    visited[next] = visited[now] + 1;
                    queue.add(next);

                    if (next == K) count++;
                }
            }
        }

    }
}