package Backjoon.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 회전초밥_2531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int N = Integer.parseInt(st.nextToken()); // 접시의 수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가지 수
        int k = Integer.parseInt(st.nextToken()); // 연속으로 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int left = 0; // 왼쪽 포인터
        int right = 0; // 오른쪽 포인터
        int count = 0; // 연속으로 고르는 수
        int chobob = 0; // 손님이 먹는 초밥의 종류 수
        Set<Integer> set = new HashSet<>(); // 중복값 제거

        while (left < N) {
            set.add(arr[right]); // 초밥 넣기
            right++;
            count++;
            if (right == N) right = 0; // 값이 끝에 오면 0번째로 이동

            if (count == k) { // k번째 만큼 접시를 고른 경우 다음 찾기
                left++;
                right = left;

                // 초밥이 없는 경우 무료 제공
                if (!set.contains(c)) chobob = Math.max(chobob, set.size() + 1);
                else chobob = Math.max(chobob, set.size());

                set.clear();
                count = 0;
            }

        }


        System.out.println(chobob);
    }
}