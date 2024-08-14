package 과거의산물.other;

import java.util.Scanner;

public class _1747 {

    static boolean[] prime = new boolean[100000001];

    private static void sosu(int n) {

        prime[0] = prime[1] = true; // 소수는 false.

        for (int i = 2; i * i <= 10000000; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= 10000000; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= 10000000; i++) {
            if (!prime[i] && i >= n) {
                if (isPalindrome(String.valueOf(i)) != 0) {
                    System.out.println(isPalindrome(String.valueOf(i)));
                    return;
                }
            }
        }

    }

    private static int isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return 0;
            }
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sosu(n);

    }
}