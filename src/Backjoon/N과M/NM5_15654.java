package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.acmicpc.net/problem/15654

public class NM5_15654 {
    static int N, M;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        visited = new int[N + 1];
        input = br.readLine().split(" ");
        int[] nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);

        ArrayList<Integer> temp = new ArrayList<>();
        permutation(temp, nums);

    }

    private static void permutation(ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == M) {
            StringBuilder sb = new StringBuilder();
            for (Integer num : temp) {
                sb.append(num).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] > 0) continue;
            visited[i] = 1;
            temp.add(nums[i]);

            permutation(temp, nums);

            visited[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }
}
