package 과거의산물.other;

import java.util.Scanner;

public class _1821DnotKnwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int F = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = n - 1; i >= 0; i++) {
            arr[i] = F % (i + 1);
            F /= (i + 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}