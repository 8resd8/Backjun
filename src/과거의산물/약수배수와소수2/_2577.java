package 과거의산물.약수배수와소수2;

import java.io.*;
import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int multiABC = A * B * C;
        int[] sum = new int[10];

        String newMulti = String.valueOf(multiABC);
        for (int i = 0; i < newMulti.length(); i++) {
            int number = Integer.parseInt(String.valueOf(newMulti.charAt(i)));
            sum[number]++;
        }

        for (int j : sum) {
            System.out.println(j);
        }

    }
}