package 과거의산물.일반수학1;

import java.util.Scanner;

public class _10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int maxIndex = (Math.max(a.length(), b.length()));

        StringBuilder sum = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxIndex; i++) {
            int A = i < a.length() ? a.charAt(a.length() - i - 1) - '0' : 0;
            int B = i < b.length() ? b.charAt(b.length() - i - 1) - '0' : 0;

            int temp = A + B + carry; // 자리수 있으면 더하기 없으면 0임.

            carry = temp / 10; // 10넘으면 1 작으면 0
            sum.insert(0, temp % 10);
        }


        if (carry > 0) { // 마지막 올림수가 있으면 마무리
            sum.insert(0, carry);
        }
        System.out.println(sum);


//        for (int i = maxIndex - 1; i >= maxIndex - minIndex ; i--) {
//
//            System.out.println("i = " + i);
//            System.out.println("a.charAt(i) = " + a.charAt(i));
//            System.out.println("b.charAt(i) = " + b.charAt(i));
//
//            int temp = Integer.parseInt(String.valueOf(a.charAt(i)))  + Integer.parseInt(String.valueOf(b.charAt(i))); // 15
////            System.out.println("temp = " + temp);
//
//            if (temp >= 10) {
//                sum[i + 1] += temp - 10;
//                sum[i]++;
////                System.out.printf("sum[%d] = %d \n", i, sum[i]);
//                continue;
//            }
//            sum[i + 1] += temp;
////            System.out.printf("sum[%d] = %d \n", i, sum[i]);
//        }

//        for (int i = 0; i < maxIndex + 1; i++) {
//            System.out.printf("%d", sum[i]);
//
//        }

    }
}