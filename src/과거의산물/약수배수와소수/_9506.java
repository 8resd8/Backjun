package 과거의산물.약수배수와소수;

import java.util.Scanner;

public class _9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int p = sc.nextInt(); // 약수
            if (p == -1) {
                break;
            }

            int[] arr = new int[p]; // 약수 값들을 저장할 배열
            int count = 0;
            int sum = 0; // 완전수를 확인할 합계

            for (int i = 1; i < p; i++) {
                if (p % i == 0) {
                    arr[++count] = i;
                    sum += i;
                }
            }

            if (sum == p) {
                System.out.printf("%d = ", p);
                for (int i = 1; i <= count; i++) {
                    System.out.printf("%d ", arr[i]);
                    if (i < count) {
                        System.out.printf("+ "); // +는 1번 빼줘야 해서 따로 출력해주기
                    }
                }
            } else {
                System.out.printf("%d is NOT perfect.", p);
            }
            System.out.println();

        }

    }
}