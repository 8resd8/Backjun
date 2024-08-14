package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 8;
        int[][] arr = new int[t][2];
        for (int i = 0; i < t; i++) {
            int number = Integer.parseInt(br.readLine());
            arr[i][0] = i + 1; // 순서
            arr[i][1] = number; // 실제 점수
        }

//        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        int[] answer = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            answer[i] = arr[i][0];
            sum += arr[i][1];
        }
        Arrays.sort(answer);
        System.out.println(sum);
        for (int i : answer) {
            System.out.print(i + " ");
        }


    }
}