package 과거의산물.백트래킹;

import java.io.*;

public class _15649 {

    static boolean[][] visited;
    static int[] arr;

    private static void dfs(int n, int m, int depth) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (depth == m) {
            for (int value : arr) {
                bw.write(value + " ");
            }
            bw.write("\n");
            bw.flush();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[depth][i]) {
                visited[depth][i] = true;

                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visited[depth][i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        visited = new boolean[n][n + 1];
        arr = new int[m];
        dfs(n, m, 0);

        br.close();
    }
}