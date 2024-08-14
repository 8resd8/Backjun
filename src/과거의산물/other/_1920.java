package 과거의산물.other;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> Arr = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Arr.add(sc.nextInt());
        }

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (Arr.contains(sc.nextInt())) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }


    }
}