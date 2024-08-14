package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// https://www.acmicpc.net/problem/15655

public class NM6_15655 {
    static int N, M;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        visited = new int[N + 1];
        int[] nums = new int[N];

        input = br.readLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);

        ArrayList<Integer> temp = new ArrayList<>();
        permutation(temp, nums, 0);
    }

    private static void permutation(ArrayList<Integer> temp, int[] nums, int start) {
        if (temp.size() == M) {
            StringBuilder sb = new StringBuilder();
            for (Integer number : temp) {
                sb.append(number).append(" ");
            }
            System.out.println(sb);
            return;
        }

        for (int i = start; i < N; i++) {
            if (visited[i] == 1) continue;
            temp.add(nums[i]);
            visited[i] = 1;

            permutation(temp, nums, i + 1);
            visited[i] = 0;
            temp.remove(temp.size() - 1);
        }
    }
}