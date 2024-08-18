package Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/4179

public class 불_4179 {
    static String[] map;
    static int[][] fireTime;
    static int[][] jiHun;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        fireTime = new int[N][M];
        jiHun = new int[N][M];
        map = new String[N];

        // 초기값 -1
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine();
            Arrays.fill(fireTime[i], -1);
            Arrays.fill(jiHun[i], -1);
        }

        Queue<int[]> fire = new LinkedList<>();
        Queue<int[]> hun = new LinkedList<>();


    }

}