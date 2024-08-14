package 과거의산물.구현2;

import java.io.IOException;
import java.util.Scanner;

public class _11943 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int oneA = sc.nextInt();
        int oneB = sc.nextInt();
        int twoA = sc.nextInt();
        int twoB = sc.nextInt();

        int minCount = Math.min(oneA + twoB, oneB + twoA);
        System.out.println(minCount);


    }
}