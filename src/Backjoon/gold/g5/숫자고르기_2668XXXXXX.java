package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 숫자고르기_2668XXXXXX {
    static int N; // 전체 숫자의 개수
    static int[] numbers; // 각 숫자가 가리키는 번호를 저장할 배열
    static boolean[] visited; // 각 숫자가 방문되었는지 체크하는 배열
    static boolean[] currentPath; // 현재 탐색 중인 경로를 체크하는 배열
    static ArrayList<Integer> answer; // 사이클을 형성하는 숫자들을 저장할 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N + 1];
        visited = new boolean[N + 1];
        currentPath = new boolean[N + 1];
        answer = new ArrayList<>();

        // 입력 받기
        for (int i = 1; i <= N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 각 숫자를 시작점으로 사이클을 찾기 위해 DFS 탐색
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1]; // 탐색마다 방문 배열 초기화
            currentPath = new boolean[N + 1]; // 탐색마다 현재 경로 배열 초기화
            dfs(i, i); // 사이클 탐색
        }

        // 결과 정렬
        Collections.sort(answer);

        // 결과 출력
        System.out.println(answer.size());
        for (int num : answer) {
            System.out.println(num);
        }
    }

    // DFS를 사용하여 사이클을 찾는 함수 (리턴 타입이 void)
    private static void dfs(int start, int current) {
        if (visited[current]) return;

        visited[current] = true;
        currentPath[current] = true;

        int next = numbers[current];
        if (!visited[next]) {
            dfs(start, next);
        } else if (currentPath[next] && next == start) {
            // 사이클이 발견되면, 시작 노드와 같은 노드인 경우에만 추가
            answer.add(start);
        }

        currentPath[current] = false; // 경로에서 빠져나올 때 경로 체크 해제
    }
}