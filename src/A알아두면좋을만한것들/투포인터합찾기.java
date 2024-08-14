package A알아두면좋을만한것들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 투포인터합찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(input[i]));
        }
        Collections.sort(arr);

        int target = Integer.parseInt(br.readLine());
        int count = getCount(n, arr, target);


        System.out.println(count);
    }

    private static int getCount(int n, List<Integer> arr, int target) {
        int count = 0;
        int left = 0;
        int right = n - 1;

        // 정렬되어 있는 데이터의 경우에서만 활용
        // left = 시작값, right = 끝값에서 시작, left < right까지
        // left + right == target이라면 쌍 저장 (left, right)
        // left + right < target이라면 값이 작다는 뜻이니깐 left++
        // left + right > target이라면 값이 크다는 뜻이니깐 right--  <--- 오른쪽값을 줄이는거임
        while (left < right) {
            int sum = arr.get(left) + arr.get(right);
            if (sum == target) {
                count++;
                left++;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}