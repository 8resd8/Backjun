package 입출력과사칙연산.src.Backjoon;

// https://www.acmicpc.net/problem/14003

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열_14003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[n + 1];
        for (int j = 0; j < n; j++) {
            list[j] = Integer.parseInt(st.nextToken());
        }

        int[] LIS = new int[n + 1];
        int e = 0;
        for (int j = 0; j < n; j++) {
            int idx = binary(LIS, 0, e - 1, list[j]);
            LIS[idx] = list[j];
            if (e == idx) e++;
        }

        System.out.println(e);
        for (int li : LIS) {
            if (li != 0) System.out.print(li + " ");
        }

    }

    private static int binary(int[] arr, int s, int e, int value) {
        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] < value) {
                s = mid + 1;
            } else if (arr[mid] > value) {
                e = mid - 1;
            } else {
                return mid; // 인덱스
            }
        }
        return s; // 인덱스
    }
}
