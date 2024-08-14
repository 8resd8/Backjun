package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/2667
public class 단지번호붙이기_2667 {
    static int[][] map;
    static int[][] visited;
    static int[] nx = {0, 0, -1, 1}; // 상 하 좌 우
    static int[] ny = {-1, 1, 0, 0}; // 상 하 좌 우
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(input.charAt(j));
            }
        }

        ArrayList<Integer> complexes = new ArrayList<>(); // 크기를 저장

        // 모든 지점 확인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visited[i][j] == 0) {
                    int size = bfs(i, j);
                    complexes.add(size); // 크기를 저장
                }
            }
        }


        Collections.sort(complexes);
        System.out.println(complexes.size());
        for (int complex : complexes) {
            System.out.println(complex);
        }
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 1;
        int count = 1; // 단지의 크기


        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 좌표
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int newX = curX + nx[i];
                int newY = curY + ny[i];

                if (isValid(newX, newY) && map[newX][newY] == 1 && visited[newX][newY] == 0) {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = 1;
                    count++; // 단지의 크기
                }
            }

        }

        return count;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < N;
    }
}