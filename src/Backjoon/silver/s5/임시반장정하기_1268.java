package Backjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 임시반장정하기_1268 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] students = new int[num][5];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				students[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = 0;
		int leader = 0;

		for (int i = 0; i < num; i++) {
			Set<Integer> set = new HashSet<>();
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < num; k++) {
					if (students[i][j] == students[k][j] && i != k) {
						set.add(k);
					}
				}
			}
			if (set.size() > max) {
				leader = i;
				max = set.size();
			}
		}

		System.out.println(leader + 1);
	}
}
