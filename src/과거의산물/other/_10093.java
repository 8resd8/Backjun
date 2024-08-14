package 과거의산물.other;

import java.util.Scanner;

public class _10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long a = Math.min(A, B);
        long b = Math.max(A, B);


        long count = 0;
        if (a != b) {
            for (long i = a + 1; i < b; i++) {
                count++;
            }
        }


        System.out.println(count);
        for (long i = a + 1; i < b; i++) {
            System.out.printf("%d ", i);
        }


    }
}