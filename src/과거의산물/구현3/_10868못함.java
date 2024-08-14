package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10868못함 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            int answer = findMinValue(arr, start, end);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);

    }

    private static int findMinValue(int[] arr, int start, int end) {
        int minValue = Integer.MAX_VALUE;
        for (int i = start - 1; i < end; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return minValue;
    }
}