package 과거의산물.구현;

import java.util.Scanner;

public class _1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int F = sc.nextInt();

        StringBuilder newN = new StringBuilder();

        // 뒤자리 2개를 뺀 앞 숫자
        for (int i = 0; i < N.length() - 2; i++) {
            newN.append(N.charAt(i));
        }

        // 뒤자리 00부터 99까지 확인
        for (int i = 0; i < 100; i++) {
            newN.append(String.format("%02d", i));
            int number = Integer.parseInt(String.valueOf(newN));
            if (number % F == 0) {
                System.out.printf("%02d \n", i);
                break;
            }
            newN.delete(newN.length() - 2, newN.length());
        }


    }
}
