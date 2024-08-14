package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자배열회전D2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int testCase = 1; testCase <= t; testCase++) {
            int N = Integer.parseInt(br.readLine());
            /*
            1 2 3 기본
            4 5 6
            7 8 9

            7 4 1 90도   741
            8 5 2        852
            9 6 3        963

            9 8 7 180도  987
            6 5 4        654
            3 2 1        321

            3 6 9 270도  369
            2 5 8        258
            1 4 7        147
            * */

            // 입력
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(input[j]);
                }
            }


            String[][] answer = new String[N][N];
            int[][] rotateArr = rotation(N, arr);
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {
                    String value = "";

                    for (int k = 0; k < N; k++) {
                        value += rotateArr[j][k];
                    }
                    answer[j][i] = value;
                }
                rotateArr = rotation(N, rotateArr);
            }


            System.out.println("#" + testCase);
            for (String[] ints : answer) {
                for (int i = 0; i < 3; i++) {
                    String anInt = ints[i];
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }

    }

    private static int[][] rotation(int N, int[][] arr) {
        int[][] rotateArr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotateArr[i][j] = arr[N - 1 - j][i]; // 3 2 1
            }
        }
        return rotateArr;
    }
}