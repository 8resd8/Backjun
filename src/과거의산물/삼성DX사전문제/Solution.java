package 과거의산물.삼성DX사전문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testN = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= testN; testCase++) {
            String[] nmq = br.readLine().split(" ");
            int N = Integer.parseInt(nmq[0]);
            int M = Integer.parseInt(nmq[1]);
            int Q = Integer.parseInt(nmq[2]);

            int[][] marsSize = new int[N][M];
            int[] rowMax = new int[N];
            int[] colMax = new int[M];
            long safeCells = 0; // 안전한 셀 개수


            // 화성 N * M 초기값과 가로 세로 최대값 구하기
            for (int i = 0; i < N; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    marsSize[i][j] = Integer.parseInt(row[j]);
                    rowMax[i] = Math.max(rowMax[i], marsSize[i][j]);
                    colMax[j] = Math.max(colMax[j], marsSize[i][j]);
                }
            }

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            // Q번의 보고서 업데이트가 주어진다.
            for (int i = 0; i < Q; i++) {
                boolean[][] visited = new boolean[N][M];
                String[] update = br.readLine().split(" ");
                int r = Integer.parseInt(update[0]) - 1;
                int c = Integer.parseInt(update[1]) - 1;
                int x = Integer.parseInt(update[2]);

                // (r, c) = x 변경, 가로, 세로의 최대값 수정
                rowMax[r] = Math.max(rowMax[r], x);
                colMax[c] = Math.max(colMax[c], x);
                marsSize[r][c] = x;

                for (int k = 0; k < N; k++) {
                    for (int j = 0; j < M; j++) {
                        if (marsSize[k][j] >= rowMax[k] && marsSize[k][j] >= colMax[j]) {
                            safeCells++;
                        }
                    }
                }


            }



            System.out.printf("#%d %d \n", testCase, safeCells);


        }
    }
}