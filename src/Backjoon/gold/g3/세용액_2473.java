package Backjoon.gold.g3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세용액_2473 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);


		long zero = Long.MAX_VALUE;
		int[] answer = new int[3];

		for (int i = 0; i < N - 1; i++) {
			int left = i + 1;
			int right = N - 1;

			// i는 고정하고 뒤에 값으로 투포인터 검색
			while (left < right) {
				long sum = (long)arr[i] + arr[left] + arr[right];

				if (Math.abs(sum) < Math.abs(zero)) {
					zero = sum;
					answer[0] = arr[left];
					answer[1] = arr[right];
					answer[2] = arr[i];
				}

				if (sum < 0) {
					left++;
				} else if (sum > 0) {
					right--;
				} else {
					System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
					break;
				}
			}
		}


		Arrays.sort(answer);
		for (int i = 0; i < 3; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
