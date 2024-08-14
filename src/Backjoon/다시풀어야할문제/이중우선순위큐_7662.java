package Backjoon.다시풀어야할문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 이중우선순위큐_7662 {
    static HashMap<Integer, Integer> count = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 기본 오름차순
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 내림차수
            count.clear();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String type = st.nextToken();
                Integer value = Integer.parseInt(st.nextToken());

                switch (type) {
                    case "I":
                        minHeap.add(value);
                        maxHeap.add(value);
                        count.put(value, count.getOrDefault(value, 0) + 1); // 빈도 저장
                        break;
                    case "D":
                        if (value == 1) {
                            remove(maxHeap);
                        } else if (value == -1) {
                            remove(minHeap);
                        }
                        break;
                }

            }

            // 위에서 remove했지만 한쪽 큐의 데이터만 제거했으므로 반대쪽에 남아있는 데이터 삭제
            while (!minHeap.isEmpty() && count.getOrDefault(minHeap.peek(), 0) == 0) {
                minHeap.poll();
            }

            while (!maxHeap.isEmpty() && count.getOrDefault(maxHeap.peek(), 0) == 0) {
                maxHeap.poll();
            }

            if (minHeap.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(maxHeap.peek() + " " + minHeap.peek());
            }
        }
    }

    private static void remove(PriorityQueue<Integer> heap) {
        // heap.remove는 O(n), 다른 방법으로 제거
        while (!heap.isEmpty()) {
            int now = heap.poll(); // 최소 또는 최대 하나를 꺼내

            if (count.get(now) > 0) { // 그 값이 있으면
                count.put(now, count.get(now) - 1); // 값 하나 제거
                break;
            }
        }
    }
}