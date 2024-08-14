package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/13549

public class 숨바꼭질3_13549 {
    static int[] visited = new int[100001];
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" " )).mapToInt(Integer::parseInt).toArray();
        N = NK[0];
        K = NK[1];
        Arrays.fill(visited, -1);
        bfs();

        System.out.println(visited[K]);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (now == K) return;

            int[] info = new int[]{now * 2, now - 1, now + 1};
            for (int next : info) {
                if (next >= 0 && next <= 100000 && visited[next] == -1) {
                    if (now * 2 == next) { // next / 2로하면 now != 0조건 추가로 달아야해
                        visited[next] = visited[now];
                    } else {
                        visited[next] = visited[now] + 1;
                    }


                    queue.add(next);
                }

            }

        }
    }

}