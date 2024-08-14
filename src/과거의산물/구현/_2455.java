package 과거의산물.구현;

import java.util.Scanner;

public class _2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int people = 0;
        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            people -= out;
            people += in;

            max = Math.max(max, people);
        }
        System.out.println(max);


    }
}
