package A알아두면좋을만한것들;

import java.util.Arrays;
import java.util.Scanner;

public class 정렬의우선순위 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] country = new int[n][4];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                country[i][j] = sc.nextInt();
            }
        }

        // 1. 금메달 개수 우선
        // 2. 금메달 같은 경우 은메달 우선
        // 3. 금메달, 은메달 같은 경우 동메달 우선
        // 4. 금, 은, 동 같은 경우 동일한 등수

        Arrays.sort(country, (a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            if (a[2] != b[2]) return b[2] - a[2];
            return b[3] - a[3];
        });

        int rank = 1; // 1위부터 시작
        for (int i = 0; i < n; i++) {
            if (country[i][0] == k) {
                System.out.println(rank);
                break;
            }

            // 같은 메달이 없어야만 순위를 증가시킨다.
            if (i > 0) {
                boolean isCheck = false;
                for (int j = 0; j < n - 1; j++) {
                    if (country[j][1] == country[j + 1][1]) {
                        isCheck = true;
                        break;
                    }
                }
                if (isCheck) {
                    rank++;
                }
            }

        }


    }
}