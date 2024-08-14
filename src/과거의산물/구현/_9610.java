package 과거의산물.구현;


import java.io.IOException;
import java.util.Scanner;

public class _9610 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                Q1++;
            } else if (x < 0 && y > 0) {
                Q2++;
            } else if (x < 0 && y < 0) {
                Q3++;
            } else if (x > 0 && y < 0) {
                Q4++;
            } else {
                AXIS++;
            }
        }
        System.out.printf("Q1: %d\n", Q1);
        System.out.printf("Q2: %d\n", Q2);
        System.out.printf("Q3: %d\n", Q3);
        System.out.printf("Q4: %d\n", Q4);
        System.out.printf("AXIS: %d\n", AXIS);

    }
}