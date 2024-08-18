package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 평범한배낭_12865 {
    static int N, K, answer;
    static ArrayList<int[]> bag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        N = Integer.parseInt(NK[0]);
        K = Integer.parseInt(NK[1]);
        answer = 0;
        bag = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int valuable = Integer.parseInt(st.nextToken());
            bag.add(new int[]{weight, valuable});
        }

        valueCombination(0, 0, 0);
        System.out.println(answer);
    }

    private static void valueCombination(int index, int weight, int valuable) {
        if (weight > K) return;

        answer = Math.max(answer, valuable);

        if (index == N) return;
        valueCombination(index + 1, bag.get(index)[0] + weight, bag.get(index)[1] + valuable);
        valueCombination(index + 1, weight, valuable);
    }
}