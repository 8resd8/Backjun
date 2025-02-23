package Backjoon.silver.s3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class 정수a를k로만들기_25418 {
	static int A, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		System.out.println(bfs());
	}

	private static int bfs() {
		Queue<int[]> q = new ArrayDeque<>();
		q.add(new int[] {A, 0});
		boolean[] visited = new boolean[K + 1];
		visited[A] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int a = cur[0];
			int count = cur[1];
			int[] arr = {a + 1, a * 2};

			for (int now : arr) {
				if (now > K || visited[now]) continue;
				if (now == K) return count + 1;

				q.add(new int[] {now, count + 1});
				visited[now] = true;
			}
		}

		return 0;
	}
}
