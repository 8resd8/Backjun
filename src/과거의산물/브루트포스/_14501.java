package 과거의산물.브루트포스;

import java.util.Scanner;

public class _14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] que = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                que[i][j] = sc.nextInt();
            }
        }

        int maxCost = maxCost(que, n, 1, 0);
        System.out.println(maxCost);
    }

    private static int maxCost(int[][] que, int n, int day, int currentCost) {
        // 모든 날짜를 확인한 경우
        if (day > n) {
            return currentCost;
        }

        int costWith = 0;
        // 상담이 가능한 것인지 확인
        if (day + que[day][0] <= n + 1) {
            costWith = maxCost(que, n, day + que[day][0], currentCost + que[day][1]);
        }
        int costWithout = maxCost(que, n, day + 1, currentCost);


        return Math.max(costWith, costWithout);
    }
}