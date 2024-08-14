package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] input = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            input[i][0] = Integer.parseInt(s[1]); // x, y좌표를 반대로 넣기
            input[i][1] = Integer.parseInt(s[0]);
        }

        Arrays.sort(input, (arr1, arr2) -> {
            // 반환값이 "양수"라면 순서 "변경"
            // 반환값이 "0"이면 순서 "유지"
            // 반환값이 "-1"이면 순서 "유지"
            if (arr1[0] == arr2[0]) {
                // (1 5), (1, 4)일 때 5-4 = 1, "양수"이므로 순서 변경
                return arr1[1] - arr2[1];
            } else {
                return arr1[0] - arr2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(input[i][1]).append(" ").append(input[i][0]).append("\n");
        }
        System.out.println(sb);

    }
}