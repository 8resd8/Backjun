package Backjoon.gold.g5;

// https://www.acmicpc.net/problem/18405

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 경쟁적전염_08405 {
    static class Q implements Comparable<Q> {
        int x, y, value;

        public Q(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override
        public int compareTo(Q o) {
            return Integer.compare(value, o.value);
        }
    }

    static int N, K, size;
    static int S, X, Y;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int[][] map;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][N]; // N * N

        // 값 기준 오름차순
        PriorityQueue<Q> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) continue;

                pq.add(new Q(i, j, map[i][j]));
            }
        }

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken()) - 1;
        Y = Integer.parseInt(st.nextToken()) - 1;


        Queue<Q> q = new ArrayDeque<>();
        while(!pq.isEmpty()) {
            q.add(pq.poll());
        }

        size = q.size();
        System.out.println(bfs(q));
    }

    private static int bfs(Queue<Q> q) {
        int count = 0;
        while (!q.isEmpty()) {
            Q cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            int value = cur.value;
            count++;

            // 모든 초가 지나면 바로 해당 위치 출력
            if (S == 0) {
                return map[X][Y];
            }

            // 정상 값 리턴
            if (x == X && y == Y) {
                return value;
            }

            // 모든 바이러스가 1번씩 퍼지고 나면 1초 지남
            if (count == size) {
                count = 0;
                S--;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;
                if (map[nx][ny] != 0) continue;

                map[nx][ny] = value;
                q.add(new Q(nx, ny, value));
            }
        }

        return 0; // 존재하지 않으면 0
    }
}
