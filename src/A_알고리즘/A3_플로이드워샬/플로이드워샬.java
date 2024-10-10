package A_알고리즘.A3_플로이드워샬;


import java.util.Arrays;
import java.util.Scanner;

public class 플로이드워샬 {
    static final int INF = 999999;
    static int n;
    static int[][] map;

    static int[][] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dist = new int[n][n];
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        // k: 경유지
        // i: 출발지
        // j: 도착지

        // 배열 복제해서 사용 (원본 보존)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = map[i][j];
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        System.out.println("-- 최단 거리 --");
        for (int[] ints : dist) {
            System.out.println(Arrays.toString(ints));
        }
    }
}