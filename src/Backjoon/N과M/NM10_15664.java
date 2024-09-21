package Backjoon.N과M;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/15664
public class NM10_15664 {
    static int N, M;
    static int[] numbers;
    static boolean[] visited;
    static Set<ArrayList<Integer>> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        visited = new boolean[N];
        set = new HashSet<>();
        numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        dfs(0, new ArrayList<>());

    }

    private static void dfs(int index, ArrayList<Integer> temp) {
        if (temp.size() == M) {
            set.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            temp.add(numbers[i]);

            dfs(i + 1, temp);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
