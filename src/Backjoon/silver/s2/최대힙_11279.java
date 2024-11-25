package Backjoon.silver.s2;

// https://www.acmicpc.net/problem/11279

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class 최대힙_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (pq.isEmpty() && input == 0) {
                System.out.println(0);
            } else if (input == 0) {
                System.out.println(pq.poll());
            } else {
                pq.add(input);
            }
        }
    }
}
