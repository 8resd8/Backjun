package 과거의산물.그리디알고리즘;


import java.util.Scanner;

public class _1789 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        int count = 0;
        long total = 0;
        if (S == 1) {
            System.out.println(1);
            return;
        }

        for (long i = 1; i < S; i++) {
            total += i;

            if (total <= S) {
                count++;
            } else {
                break;
            }

        }

        System.out.println(count);

    }
}