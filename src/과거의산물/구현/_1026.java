package 과거의산물.구현;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Collections.sort(a);
        Arrays.sort(b);
        int result = 0;
        // b의 큰값 * a의 작은값 순서대로 쭉 곱한 값

        for (int i = 0; i < n; i++) {
            int minValue = a.get(i) * b[n - i - 1];
            result += minValue;
        }


        System.out.println(result);


    }
}
