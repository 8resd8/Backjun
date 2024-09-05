import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// https://softeer.ai/app/assessment/index.html?xid=263577&xsrfToken=9ukNXlekTSCLqLSf1TnjgRAjP7A9spxS&testType=practice

public class Test {
    static int N, M;
    static char[][] map;
    static int[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new char[N][M];
        visited = new int[N][M];
        Queue<int[]> q = new ArrayDeque<>();
        int s = 0;
        int e = 0;
        for (int i = 0; i < N; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = c[j];
                if (map[i][j] == 'G') {
                    q.add(new int[]{i, j});
                    visited[i][j] = 1;
                } else if (map[i][j] == 'N') {
                    s = i;
                    e = j;
                }
            }
        }

//        for (char[] chars : map) {
//            System.out.println(chars);
//        }

        // 유령에 대한 bfs 먼저 돌리기
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || visited[nx][ny] != 0) continue;
                q.add(new int[]{nx, ny});
                visited[nx][ny] = visited[x][y] + 1;
            }
        }

//        for (int[] ints : visited) {
//            System.out.println(Arrays.toString(ints));
//        }


        // 사람이 탈출
        q.clear();
        q.add(new int[]{s, e});
        int[][] hito = new int[N][M];
        hito[s][e] = 1;

        if (visited[s][e] <= hito[s][e]) {
            System.out.println("No");
            return;
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            if (map[x][y] == 'D') {
                System.out.println("Yes");
                return;
            }


            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || map[nx][ny] == '#') continue;
                if (visited[nx][ny] < hito[x][y] + 1) continue;

//                if (hito[nx][ny] == 0 || visited[nx][ny] >= hito[nx][ny]) {
                q.add(new int[]{nx, ny});
                hito[nx][ny] = hito[x][y] + 1;
//                }

            }

//            System.out.println();
//            for (int[] ints : hito) {
//                System.out.println(Arrays.toString(ints));
//            }
        }

        System.out.println("No");
    }
}