package 과거의산물.일반수학1;

import java.util.Scanner;

public class _11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 입력받은 수
        int base = sc.nextInt(); // 진법
//        int input = 60466175;
//        int base = 36;
        StringBuilder output = new StringBuilder();

        int result = 0;
        int pow = 0;

        while (input > 0) {
            System.out.println("result = " + input / base);
//            System.out.println(input % base);
            int temp = input % base;

            if (temp >= 10) {
                char s = (char) (temp - 10 + 'A');
                output.append(s);
            } else {
                output.append(temp);
            }
            System.out.println(temp);

            input /= base;

            }
        for (int i = output.length() - 1; i >= 0; i--) {
            System.out.print(output.charAt(i));
        }


    }
}