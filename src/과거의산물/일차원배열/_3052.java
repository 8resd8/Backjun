package 과거의산물.일차원배열;

import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] board = new int[43]; // 0 ~ 42까지 다른 값 확인하기 위한 배열
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
            board[arr[i]] = 1;
        }

        int result = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 1) {
                result++;
            }
        }
        System.out.println(result);

    }
}