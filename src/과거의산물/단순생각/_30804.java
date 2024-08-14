package 과거의산물.단순생각;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _30804 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[t];
        int[] frequency = new int[10];
        int totalCount = 0;

        // 입력받기
        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            arr[i] = number;
        }
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;

        // right 배열 끝까지 탐색
        while (right < t) {
            int frequencyTemp = 0; // 빈도를 잠시 저장할 변수

            // 종류가 3가지 미만인 경우 빈도+1, 한칸 오른쪽
            if (totalCount < 3) {
                frequency[arr[right]]++;
                right++;
            } else { // 종류가 3이상인 경우 제일 왼쪽 값의 빈도는 제거, 왼쪽값 한 칸 오른쪽
                frequency[arr[left]]--;
                left++;
            }

            // 움직일 때마다 전체 빈도 계산
            for (int i : frequency) {
                if (i != 0) frequencyTemp++;
            }
            totalCount = frequencyTemp;

            // 종류가 2가지 일때 전체 개수를 확인해서 큰 값 저장
            if (totalCount == 2) {
                int sum = 0;
                for (int i : frequency) {
                    sum += i;
                }
                max = Math.max(max, sum);
            }

        }

        int sum = 0;
        // 시작부터 종류가 적으면 모든 값 더하기
        if (max < 0) {
            for (int i : frequency) {
                sum += i;
            }
        }


        System.out.println(Math.max(max, sum));
    }
}

