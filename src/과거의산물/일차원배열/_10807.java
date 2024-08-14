package 과거의산물.일차원배열;

import java.util.Scanner;

public class _10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) cnt++;
        }
        System.out.println(cnt);

    }
}