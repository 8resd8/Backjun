package A1_자료구조.그래프;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 그래프
public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // 노드 추가
    public void addNode(int node) {
        // Absent: 없다, 존재하지않다
        // 만약 값(키)이 있다면 넣고 없으면 아무것도 하지 않는다.
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    // 간선(두 노드를 연결하는 선, Edge) 추가 (무방향 그래프)
    public void addEdge(int node1, int node2) {
        adjList.get(node1).add(node2);
        adjList.get(node2).add(node1);
    }

    // 그래프 출력
    public void printGraph() {
        for (int node : adjList.keySet()) { // node
            System.out.print(node + ": ");
            for (int neighbor : adjList.get(node)) { // ArrayList
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // 노드 추가, ArraysList는 비어있다.
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);
        graph.addNode(7);

        // 간선(edge) 추가
        graph.addEdge(1, 2); // 1-2는 연결
        graph.addEdge(1, 3); // 1-3연결
        graph.addEdge(2, 4); // 2-4연결
        graph.addEdge(2, 5); // 2-5연결
        graph.addEdge(3, 6); // 3-6연결
        graph.addEdge(3, 7); // 3-6연결

        // 그래프 출력
        graph.printGraph();
    }

}
