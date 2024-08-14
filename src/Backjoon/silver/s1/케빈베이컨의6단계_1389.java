package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 케빈베이컨의6단계_1389 {

    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nm[0];
        int m = nm[1];

        int[] visited = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }


        for (int i = 0; i < m; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adj.get(input[0]).add(input[1]);
            adj.get(input[1]).add(input[0]);

        }

        int sum = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            visited[i] = 1;

            while (!queue.isEmpty()) {
                int value = queue.poll();

                for (int i1 : adj.get(value)) {
                    if (visited[i1] == 0) {
                        queue.add(i1);
                        visited[i1] = visited[value] + 1;
                    }
                }


            }

            int s1 = 0;
            for (int i1 : visited) {
                s1 += i1;
            }


            if (sum > s1) {
                idx = i;
                sum = s1;
            }

            Arrays.fill(visited, 0);
        }

        System.out.println(idx);
    }
}