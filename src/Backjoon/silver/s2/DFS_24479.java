package Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class DFS_24479 {

    static int order = 1; // 방문 순서 카운트
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 그래프 저장 (인접 행렬)
    static int[] visited; // 방문 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMR = br.readLine().split(" ");
        int n = Integer.parseInt(NMR[0]); // 노드 수
        int m = Integer.parseInt(NMR[1]); // 간선 수
        int r = Integer.parseInt(NMR[2]); // 시작 노드

        // 그래프 초기화, 배열안에 배열 만들어주기
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보를 입력 받아 그래프 구성 (인접 행렬)
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 인접 정점 오름차순 정렬
        for (int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new int[n + 1];
        dfs(r);
        for (int i = 1; i <= n; i++) {//1-n
            System.out.println(visited[i]);
        }
    }

    static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);          // 시작 정점을 스택에 추가
        visited[start] = order++;   // 시작 정점을 방문 표시 및 방문 순서 기록

        while (!stack.isEmpty()) {
            int node = stack.pop();

            for (int i = graph.get(node).size() - 1; i >= 0; i--) { // 인접 노드를 역순으로 탐색
                int next = graph.get(node).get(i);
                if (visited[next] == 0) {
                    stack.push(next);
                    visited[next] = order++;
                }
            }
            // 일반적인 dfs 탐색
//            for (int next : graph.get(node)) {
//                if (visited[next] == 0) {
//                    stack.push(next);
//                    visited[next] = order++;
//                }
//            }
        }
    }

}