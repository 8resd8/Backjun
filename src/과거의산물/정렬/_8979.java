package 과거의산물.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class _8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] country = new int[n][4];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            country[i][0] = sc.nextInt(); // 국가 번호
            country[i][1] = sc.nextInt(); // 금메달 수
            country[i][2] = sc.nextInt(); // 은메달 수
            country[i][3] = sc.nextInt(); // 동메달 수
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

// 순위 계산 및 출력
        int rank = 1;
        int lastRank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && (country[i][1] != country[i-1][1] ||
                    country[i][2] != country[i-1][2] ||
                    country[i][3] != country[i-1][3])) {
                rank = i + 1;
            }
            if (i > 0 && (country[i][1] == country[i-1][1] &&
                    country[i][2] == country[i-1][2] &&
                    country[i][3] == country[i-1][3])) {
                rank = lastRank; // 동일한 순위 공유
            } else {
                lastRank = rank; // 동일하지 않을 때, 마지막 유효 순위 업데이트
            }
            if (country[i][0] == k) {
                System.out.println(rank);
                break;
            }
        }


    }
}