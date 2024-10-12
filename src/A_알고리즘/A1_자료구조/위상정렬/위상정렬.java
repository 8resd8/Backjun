package A_알고리즘.A1_자료구조.위상정렬;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 위상정렬 {
    static List<List<Integer>> adj;
    static int[] deg = new int[10];
    static int n;

    public static void main(String[] args) {
        // Java에서는 ArrayList로 인접 리스트 초기화
        adj = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            adj.add(new ArrayList<>());
        }

        // 예제 입력을 설정합니다.
        n = 6; // 노드의 수 (예시)
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(5).add(6);

        // 진입 차수 배열을 설정합니다.
        deg[3] = 2;
        deg[4] = 1;
        deg[5] = 1;
        deg[6] = 1;

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // 진입 차수가 0인 노드를 큐에 추가합니다.
        for (int i = 1; i <= n; i++) {
            if (deg[i] == 0) {
                queue.offer(i);
            }
        }

        // 위상 정렬 알고리즘
        while (!queue.isEmpty()) {
            int now = queue.poll();
            result.add(now);

            for (int nxt : adj.get(now)) {
                deg[nxt]--;
                if (deg[nxt] == 0) {
                    queue.offer(nxt);
                }
            }
        }

        // 사이클 여부 확인
        if (result.size() != n) {
            System.out.println("cycle exists");
        } else {
            for (int x : result) {
                System.out.print(x + " ");
            }
        }
    }
}