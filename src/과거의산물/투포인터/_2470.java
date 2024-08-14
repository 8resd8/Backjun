package 과거의산물.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[t];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);


        int left = 0;
        int right = t - 1;
        int answer1 = 0, answer2 = 0;
        int lastSum = Integer.MAX_VALUE;

        // N과 가까운 수 : 절대값
        while (left < right) {
            int sum = arr[left] + arr[right]; // -1

            if (Math.abs(lastSum) > Math.abs(sum)) {
                lastSum = sum;
                answer1 = arr[left];
                answer2 = arr[right];
            }

            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        System.out.print(answer1 + " " + answer2 + "\n");
    }
}
