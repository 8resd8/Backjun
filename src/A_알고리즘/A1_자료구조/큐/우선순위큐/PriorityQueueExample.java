package A_알고리즘.A1_자료구조.큐.우선순위큐;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // 기본: 최소 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Comparator의 reverseOrder() 사용시 최대 힙

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // 문자열 짧은 순서
        PriorityQueue<String> spq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        });

        // 1. 문자열 크기 순서 2.문자열  사전순
        PriorityQueue<String> spq1 = new PriorityQueue<>((s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            }
            return s1.compareTo(s2);
        });


        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(10);
        pq.offer(1);

        System.out.println("pq.peek() = " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // 사용자 정의 우선순위 설정 방법 2가지
        // 1. Comparable 인터페이스 구현
        // 2. Comparator 사용
    }
}
