package 과거의산물.약수배수와소수;

import java.util.Scanner;

public class _2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // 약수
        int k = sc.nextInt(); // k번째 약수 출력
        int[] arr = new int[p]; // 약수 값들을 저장할 배열
        int count = 0;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                arr[++count] = i;
            }
        }

        System.out.println(count >= k ? arr[k] : 0);
    }
}