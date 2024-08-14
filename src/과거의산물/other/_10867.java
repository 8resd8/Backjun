package 과거의산물.other;

import java.util.Scanner;
import java.util.TreeSet;

public class _10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            treeSet.add(num);
        }

        for (int i : treeSet) {
            System.out.printf("%d ", i);
        }


    }
}