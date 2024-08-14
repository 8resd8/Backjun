package 과거의산물.시간복잡도;

import java.util.Scanner;

public class _24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
//        int sum = 0;
//
//
//        for (int i = 1; i <= n - 2; i++) { // 5
//            for (int j = i + 1; j < n; j++) { // 6
//                for (int k = j + 1; k <= n; k++) { // 7
//                    sum++;
//                }
//            }
//        }
        System.out.println((n) * (n - 1) * (n - 2) / 6);
//        System.out.println(sum);
        System.out.println(3);
    }
}
// 3 6 10 15 21
// 3 - 1
// 4 - 4
// 5 - 10
// 6 - 20
// 7 - 35
// 8 - 56