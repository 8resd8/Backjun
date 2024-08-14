package 과거의산물.약수배수와소수;

import java.util.Scanner;

public class _2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[b - a + 1];
        int count = 0, sum = 0;

        for (int j = a; j <= b; j++) {
            if (j == 1) continue;
            boolean check = true;

            for (int i = 2; i < j; i++) {
                if(j % i == 0) { // 소수가 아님
                    check = false;
                    break;
                }
            }
            if (check) {
                arr[count++] = j;
                sum += j;
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(arr[0]);
        }


    }
}