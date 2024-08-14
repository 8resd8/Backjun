package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _9229 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String[] snackWeight = br.readLine().split(" ");

            int[] snacks = new int[N];
            for (int j = 0; j < snacks.length; j++) {
                snacks[j] = Integer.parseInt(snackWeight[j]);
            }
            Arrays.sort(snacks);

            int left = 0;
            int right = N - 1;
            int answer = -1;

            while (left < right) {
                int sum = snacks[left] + snacks[right];

                if (sum == M) {
                    answer = sum;
                    break;
                } else if (sum > M) {
                    right--;
                } else { // 값 갱신
                    if (sum > answer) {
                        answer = sum;
                    }
                    left++;
                }
            }


            System.out.printf("#%d %d\n", i + 1, answer);
        }


    }
}