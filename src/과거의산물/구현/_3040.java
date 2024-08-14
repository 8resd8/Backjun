package 과거의산물.구현;

import java.util.Scanner;

public class _3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            int input = sc.nextInt();
            sum += input;
            arr[i] = input;
        }

        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    result1 = i;
                    result2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (result1 == i || result2 == i) {
                continue;
            }
            System.out.println(arr[i]);
        }




    }
}