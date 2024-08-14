package 과거의산물.구현2;

import java.io.IOException;
import java.util.Scanner;

public class _10797 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int car = sc.nextInt();
            if (day == car) {
                count++;
            }
        }
        System.out.println(count);


    }
}