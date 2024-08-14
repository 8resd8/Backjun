package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/13913

public class 숨바꼭질4_13913 {
    static int[] visited = new int[100001];
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        N = NK[0];
        K = NK[1];

        if (N == K) {
            System.out.println(visited[K]);
            System.out.println(K);
            return;
        }

        List<Integer> list = new ArrayList<>();
        list.add(K); // K는 반드시 찾는다.

        bfs();
        int value = K;
        for (int i = 0; i < visited.length; i++) {
            int[] arr = new int[]{value / 2, value + 1, value - 1};

            for (int previous : arr) {
                if (previous >= 0 && visited[value] == visited[previous] + 1) {
                    System.out.println("previous = " + previous);
                    System.out.println("value = " + value);
                     list.add(previous);
                    value = previous;
                    break;
                }
            }
        }

        list.add(N); // 시작지점은 항상 출발지점

        System.out.println(visited[K]);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(list.size() - i - 1) + " ");
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            int[] info = new int[]{now - 1, now + 1, now * 2};
            for (int next : info) {
                if (next >= 0 && next <= 100000 && (visited[next] == 0 || visited[next] > visited[now])) {
                    visited[next] = visited[now] + 1;
                    queue.add(next);

                    if (next == K) {
                        return;
                    }
                }
            }
        }

    }
}