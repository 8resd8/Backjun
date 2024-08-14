package 과거의산물.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _9076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            List<Integer> cost = new ArrayList<>();

            for (int j = 0; j < 5; j++) {
                cost.add(sc.nextInt());
            }
            Collections.sort(cost);
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;

            for (int k = 1; k < cost.size() - 1; k++) {
                int costNumber = cost.get(k);

                max = Math.max(max, costNumber);
                min = Math.min(min, costNumber);
                sum += costNumber;
            }

            if (max - min >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(sum);
            }

        }


    }
}