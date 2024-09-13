package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14889
public class 스타트와링크_14889 { // 09:13
    static int N, answer;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        init();

        // 모든 조합을 구하기
        combination(0);
        System.out.println(answer);
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N];
        answer = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void solve() {
        int aTeam = 0;
        int bTeam = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (visited[i] && visited[j]) {
                    aTeam += map[i][j] + map[j][i];
                } else if (!visited[i] && !visited[j]) {
                    bTeam += map[i][j] + map[j][i];
                }
            }
        }
        answer = Math.min(answer, Math.abs(aTeam / 2 - bTeam / 2));
    }

    private static void combination(int index) {
        if (answer == 0) return;
        if (index == N / 2) {
            solve();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            combination(index + 1);
            visited[i] = false;
        }
    }
}