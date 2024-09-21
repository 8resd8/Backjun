package Backjoon.gold.g4;

// https://www.acmicpc.net/problem/1261

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 알고스팟_1261 {
    static class Edge implements Comparable<Edge> {
        int x, y, cost;

        public Edge(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 가로크기
        N = Integer.parseInt(st.nextToken()); // 세로크기
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        bfs0(); // Deque
//        bfs(); // PriorityQueue
    }

    private static void bfs0() {
        Deque<Edge> deque = new ArrayDeque<>();

        deque.addFirst(new Edge(0, 0, 0));
        int[][] visited = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], -1);
        }
        visited[0][0] = 0;

        while (!deque.isEmpty()) {
            Edge cur = deque.pollFirst(); // 0을 우선으로 탐색
            int x = cur.x;
            int y = cur.y;

            if (x == N - 1 && y == M - 1) {
                System.out.println(cur.cost);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny] != -1) continue;
                visited[nx][ny] = visited[x][y] + 1;

                if (map[nx][ny] == 0) {
                    deque.addFirst(new Edge(nx, ny, cur.cost));
                } else if (map[nx][ny] == 1) {
                    deque.addLast(new Edge(nx, ny, cur.cost + 1));
                }

            }
        }
    }

    private static void bfs() {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0, 0));
        int[][] visited = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(visited[i], -1);
        }
        visited[0][0] = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll(); // 0을 우선으로 탐색
            int x = cur.x;
            int y = cur.y;

            if (x == N - 1 && y == M - 1) {
                System.out.println(cur.cost);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny] != -1) continue;
                visited[nx][ny] = visited[x][y] + 1;

                if (map[nx][ny] == 0) {
                    pq.add(new Edge(nx, ny, cur.cost));
                } else {
                    pq.add(new Edge(nx, ny, cur.cost + 1));
                }
            }
        }
    }
}