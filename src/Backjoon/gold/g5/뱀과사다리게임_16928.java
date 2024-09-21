package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 뱀과사다리게임_16928 {
    static int N, M, answer = Integer.MAX_VALUE;
    static int[] sadary, baem;
    static int[] visited = new int[101];

    public static void main(String[] args) throws IOException {
        init();
        bfs(1);
        System.out.println(answer);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == 100) {
                answer = visited[current];
                return;
            }

            for (int i = 1; i <= 6; i++) {
                int next = current + i;

                if (next > 100 || visited[next] != 0) continue;

                if (sadary[next] != 0) { // 일단 이동
                    queue.add(sadary[next]);
                    if (visited[sadary[next]] == 0) // 이미 값이 있으면 +1
                        visited[sadary[next]] = visited[current] + 1;
                } else if (baem[next] != 0) {
                    queue.add(baem[next]);
                    if (visited[baem[next]] == 0)
                        visited[baem[next]] = visited[current] + 1;
                } else {
                    queue.add(next);
                    visited[next] = visited[current] + 1;
                }
            }

        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        StringTokenizer st;
        sadary = new int[101];
        baem = new int[101];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sadary[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            baem[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
    }
}