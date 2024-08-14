package 과거의산물.그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11497 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            String[] input = br.readLine().split(" ");
            for (String s : input) {
                list.add(Integer.parseInt(s));
            }
            Collections.sort(list);

            // 짝수와 홀수를 다른 배열에 놓기
            int[] arr = new int[n];
            int left = 0;
            int right = n - 1;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    arr[left++] = list.get(j);
                } else {
                    arr[right--] = list.get(j);
                }
            }

            int differ = 0;
            for (int j = 0; j < n; j++) {
                // 처음과 끝을 비교하기 위해 한칸 민것
                int diffIdx = (j + 1) % n;
                differ = Math.max(differ, Math.abs(arr[j] - arr[diffIdx]));
            }


            System.out.println(differ);
        }


    }
}