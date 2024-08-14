package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/2583

public class 영역구하기_2583 {
    static int[][] map;
    static int[][] visited;
    static int N, M, K;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        M = Integer.parseInt(input[0]); // M * N 크기의 모눈종이
        N = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]); // K개의 직사각형을 그린다
        map = new int[M][N];
        visited = new int[M][N];

        for (int i = 0; i < K; i++) {
            // 왼쪽아래 좌표, 오른쪽 위 좌표
            input = br.readLine().split(" ");
            int a1 = Integer.parseInt(input[0]); // 세로
            int b1 = Integer.parseInt(input[1]); // 가로
            int a2 = Integer.parseInt(input[2]);
            int b2 = Integer.parseInt(input[3]);

            for (int j = b1; j < b2; j++) {
                for (int k = a1; k < a2; k++) {
                    map[j][k] = 1;
                }
            }
        }

        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && visited[i][j] == 0) {
                    result.add(bfs(i, j));
                    count++;
                }
            }
        }

        Collections.sort(result);
        System.out.println(count);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    private static int bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = 1; // 방문 처리
        int count = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            count++;
            int x = now[0];
            int y = now[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && map[nx][ny] == 0 && visited[nx][ny] == 0) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = 1;
                }
            }
        }


        return count;
    }
}