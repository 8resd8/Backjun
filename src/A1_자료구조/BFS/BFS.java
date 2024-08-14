package A1_자료구조.BFS;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        // 그래프를 인접 리스트로 표현
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 4, 5));
        graph.put(3, Arrays.asList(1, 6, 7));
        graph.put(4, List.of(2));
        graph.put(5, List.of(2));
        graph.put(6, List.of(2));
        graph.put(7, List.of(2));

        // BFS 탐색 시작
        bfs(graph, 1);
        printGraph(graph);
    }


    private static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        // 시작 노드를 큐와 방문 배열에 추가
        queue.add(start);
        visited.add(start);

        while ((!queue.isEmpty())) {
            int node = queue.poll(); // 맨 앞 큐를 빼기
            System.out.print(node + " ");

            // 인접 노드를 모두 확인
            List<Integer> neighbors = graph.get(node);
            if (neighbors != null) {
                for (Integer neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
    }

    public static void printGraph(Map<Integer, List<Integer>> adjList) {
        for (int node : adjList.keySet()) { // node
            System.out.print(node + ": ");
            for (int neighbor : adjList.get(node)) { // ArrayList
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
