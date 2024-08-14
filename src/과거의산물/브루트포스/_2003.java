package 과거의산물.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n];

        input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < n) {
            sum += arr[right];

            while (sum > m) {
                sum -= arr[left++];
            }

            if (sum == m) {
                count++;
            }

            right++;
        }
        System.out.println(count);



    }
}