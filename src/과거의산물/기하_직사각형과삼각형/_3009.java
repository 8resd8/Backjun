package 과거의산물.기하_직사각형과삼각형;

import java.util.Scanner;

public class _3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[1001];
        int[] y = new int[1001];

        for (int i = 0; i < 3; i++) {
            x[sc.nextInt()]++;
            y[sc.nextInt()]++;
        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                System.out.printf("%d ", i);
                break;
            }
        }

        for (int i = 0; i < y.length; i++) {
            if (y[i] == 1) {
                System.out.printf("%d ", i);
                break;
            }
        }

    }
}