package 과거의산물.other;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class _2749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        ArrayList<BigInteger> bigInteger = new ArrayList<>();
        bigInteger.add(BigInteger.valueOf(0));
        bigInteger.add(BigInteger.valueOf(1));

        System.out.println(bigInteger.get(0));

        for (long i = 2; i < Long.parseLong(n); i++) {
            BigInteger value = bigInteger.get((int) i - 1).add(bigInteger.get((int) i - 2));
            bigInteger.add(value);
        }

        System.out.println(bigInteger.get(Integer.parseInt(n)).remainder(BigInteger.valueOf(1000000)));


    }
}