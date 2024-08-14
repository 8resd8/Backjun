package 과거의산물.other;

import java.util.Scanner;
import java.util.TreeSet;

public class _2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] nine = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            nine[i] = sc.nextInt();
            sum += nine[i];
        }
        int exceptionA = 0;
        int exceptionB = 0;

        TreeSet<Integer> result = new TreeSet<>();
        // 9개의 수를 모두 더하고 2개만 빼서 100인지 확인
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - nine[i] - nine[j] == 100) {
                    exceptionA = i;
                    exceptionB = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == exceptionA || i == exceptionB) {
                continue;
            }
            result.add(nine[i]);
        }

        for (int i : result) {
            System.out.println(i);
        }


    }
}