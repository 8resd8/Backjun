package 과거의산물.일차원배열;

import java.util.Scanner;

public class _5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] check = new int[31];

        for (int i = 1; i <= 28; i++) {
            check[sc.nextInt()] = 1; // 출석한 사람
        }

        int idx = 0;
        int[] result = new int[2]; // 출석 안 한 사람
        for (int i = 1; i < check.length; i++) { // 1 ~ 30번까지 확인
            if (check[i] != 1) {
                result[idx++] = i;
            }
        }

        if (result[0] < result[1]) {
            System.out.println(result[0] + "\n" + result[1]);
        } else {
            System.out.println(result[1] + "\n" + result[0]);
        }


    }
}