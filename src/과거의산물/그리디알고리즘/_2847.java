package 과거의산물.그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2847 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            int num = arr[i];
            // 쉬운 레벨이 점수가 같거나 큰 경우
            if (arr[i - 1] >= num) {
                int target = num - 1; // 바뀌어야 하는 값
                count += arr[i - 1] - target; // 바뀌어야 하는 값과 현재값 비교해서 값 차이 구하기
                arr[i - 1] = target; // 값 변경
            }
        }
        System.out.println(count);

    }
}