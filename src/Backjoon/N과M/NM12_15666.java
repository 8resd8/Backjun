package Backjoon.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class NM12_15666 {
    static int N, M;
    static int[] numbers;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        numbers = new int[N];
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        dfs(0, new ArrayList<>());
        System.out.println(sb);
    }

    private static void dfs(int index, ArrayList<Integer> temp) {
        System.out.println(numbers[index]);

        if (temp.size() == M) {
            for (Integer nu : temp) {
                sb.append(nu).append(" ");
            }
            sb.append("\n");
            return;
        }

        int pre = -1;
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            if (numbers[i] == pre) continue;

            visited[i] = true;
            pre = numbers[i];
            temp.add(numbers[i]);

            dfs(i, temp);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}