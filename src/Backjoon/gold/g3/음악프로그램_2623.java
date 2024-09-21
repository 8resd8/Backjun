package Backjoon.gold.g3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

// https://www.acmicpc.net/problem/2623
public class 음악프로그램_2623 {
    static int N, M, processCount;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] inDegree;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {
        init();
        topologicalSort();

        if (processCount == N) {
            for (Integer node : result) {
                System.out.println(node);
            }
        } else {
            System.out.println(0);
        }
    }

    private static void topologicalSort() {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == 0) queue.add(i); // 진입차수가 0인 값을 큐에 넣기
        }

        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            processCount++; // 정상적으로 가능한지 확인
            result.add(curNode);

            for (Integer next : adj.get(curNode)) {
                inDegree[next]--;
                if (inDegree[next] == 0) queue.add(next);
            }
        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]); // 가수의 수, 정점
        M = Integer.parseInt(NM[1]); // 보조PD 수, 횟수
        inDegree = new int[N + 1];
        adj = new ArrayList<>();
        result = new ArrayList<>();
        processCount = 0;

        for (int i = 0; i < N + 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 1; j < input.length - 1; j++) {
                int a = Integer.parseInt(input[j]);
                int b = Integer.parseInt(input[j + 1]);
                adj.get(a).add(b); // a -> b 확인
                inDegree[b]++; // 진입차수 증가
            }
        }
    }
}