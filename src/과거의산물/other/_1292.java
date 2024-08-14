package 과거의산물.other;

import java.util.Scanner;

public class _1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[1001];
        boolean stop = false;

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            int count = i;

            while (count > 0) {
                if (index > 1000) {
                    stop = true;
                    break;
                }
                arr[index++] = i;
                count--;
            }
            if (stop) break;

        }

        int sum = 0;
        for (int i = n; i <= k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}