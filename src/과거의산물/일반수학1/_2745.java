package 과거의산물.일반수학1;

import java.util.Scanner;

public class _2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // 입력받은 수
        int base = sc.nextInt(); // 진법

        int result = 0;
        int pow = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i); // Z Z Z Z Z
            int digit; // 숫자로 바꾸기

            if (c >= 'A' && c <= 'Z') {
                digit = c - 'A' + 10; // A ~ Z는 10 ~ 35
            } else {
                digit = c - '0'; // 문자를 숫자로 변환
            }

//            result += digit * pow; // 해당 자릿수에 대한 값을 더함
            result += digit * Math.pow(base, pow++);
            // digit * pow^0, digit * pow^1
//            pow *= base; // 다음 자릿수에 대한 계산을 위해 진법에 해당하는 값을 곱함

        }
        System.out.println(result);

    }
}