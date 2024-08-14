package 과거의산물.재귀;

import java.io.*;
import java.util.Scanner;

public class _2447DontKnwo {
    static char[][] block;

    static void star(int x, int y, int N, boolean blank) {

        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    block[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            block[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;

        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                star(i, j, size, count == 5);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        block = new char[n][n];

        star(0, 0, n, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(block[i][j]);
            }
            sb.append('\n');
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}