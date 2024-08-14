package Backjoon.다시풀어야할문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 모노톤길_11067XX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(input[0]);
                arr[i][1] = Integer.parseInt(input[1]);
            }
            String[] m = br.readLine().split(" ");

            // 정렬: x 오름차순, y 오름차순
            Arrays.sort(arr, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });

            // x 값이 같을 때 y 값이 감소하는 부분을 뒤집어서 올바른 순서로 만들기
            for (int i = 1; i < n; i++) {
                if (arr[i - 1][0] < arr[i][0] && arr[i - 1][1] > arr[i][1]) {
                    int start = i;
                    while (i < n && arr[i][0] == arr[start][0]) {
                        i++;
                    }
                    int end = i - 1;

                    while (start < end) {
                        int[] temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                    }
                }
            }

            // 결과 출력
            for (int i = 1; i < m.length; i++) {
                int index = Integer.parseInt(m[i]) - 1;
                sb.append(arr[index][0]).append(" ").append(arr[index][1]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
