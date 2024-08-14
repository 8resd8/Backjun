package 과거의산물.기하_직사각형과삼각형;

import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 현재 x축
        int y = sc.nextInt(); // 현재 y축
        int w = sc.nextInt(); // 오른쪽 위 꼭짓점 x축
        int h = sc.nextInt(); // 오른쪽 위 꼭짓점 y축

        int distanceW = w - x;
        int distanceH = h - y;
        int min = Math.min(x, y);
        min = Math.min(min, distanceH);
        min = Math.min(min, distanceW);

        System.out.println(min);

    }
}