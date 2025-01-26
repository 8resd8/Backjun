package Backjoon.bronze.v5;

// https://www.acmicpc.net/problem/3733

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shares_3733 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line;

		while ((line = br.readLine()) != null) {
			String[] inputs = line.split(" ");
			int N = Integer.parseInt(inputs[0]); // N명의 사람
			int S = Integer.parseInt(inputs[1]); // S개의 주식

			int x = S / (N + 1);

			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}
