package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;;

public class _10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] user = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            user[i][0] = input[0];
            user[i][1] = input[1];
        }

        Arrays.sort(user, (arr1, arr2) -> {
            int age1 = Integer.parseInt(arr1[0]);
            int age2 = Integer.parseInt(arr2[0]);
            if (age1 == age2) {
                return 0; // 유지
            } else {
                return age1 - age2; // 양수면 변경되므로 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(user[i][0]).append(" ").append(user[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
//3
//        20 Sunyoung
//        21 Junkyu
//        21 Dohyun
