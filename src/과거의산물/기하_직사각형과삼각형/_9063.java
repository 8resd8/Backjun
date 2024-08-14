package 과거의산물.기하_직사각형과삼각형;

import java.util.Scanner;

public class _9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minX = 10001;
        int maxX = -10001;
        int minY = 10001;
        int maxY = -10001;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        if (n < 2) {
            System.out.println(0);
        } else {
            int result = (maxX - minX) * (maxY - minY);
            System.out.println(result);
        }


    }
}