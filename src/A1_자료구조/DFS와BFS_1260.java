package A1_자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/1260

public class DFS와BFS_1260 {
    static ArrayList<ArrayList<Integer>> bfsArr = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> dfsArr = new ArrayList<>();
    static int[] dfsVisited;
    static int[] bfsVisited;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]) + 1; // 정점의 개수
        M = Integer.parseInt(input[1]); // 간선의 개수(연결되는 횟수)
        V = Integer.parseInt(input[2]); // 시작 번호

        // 초기화 필수
        for (int i = 0; i < N; i++) {
            bfsArr.add(new ArrayList<>());
            dfsArr.add(new ArrayList<>());
        }
        bfsVisited = new int[N];
        dfsVisited = new int[N];

        // 간선의 개수만큼 입력
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            bfsArr.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
            bfsArr.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));

            dfsArr.get(Integer.parseInt(input[0])).add(Integer.parseInt(input[1]));
            dfsArr.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));
        }

        // 작은 것부터 값을 넣기 위해 정렬하기
        for (int i = 0; i < N; i++) {
            Collections.sort(bfsArr.get(i));
            Collections.sort(dfsArr.get(i));
        }


        dfs(V);
        System.out.println();
        bfs();
    }

    private static void dfs(int now) {
        dfsVisited[now] = 1; // 바로 방문처리
        System.out.print(now + " ");

        for (int next : dfsArr.get(now)) {
            if (dfsVisited[next] == 0) {
                dfsVisited[next] = 1;
                dfs(next);
            }
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        bfsVisited[V] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");

            for (Integer next : bfsArr.get(now)) {
                if (bfsVisited[next] == 0) {
                    queue.add(next);
                    bfsVisited[next] = 1;
                }
            }
        }
    }
}
