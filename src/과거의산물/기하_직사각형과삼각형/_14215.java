package 과거의산물.기하_직사각형과삼각형;

import java.util.Arrays;
import java.util.Scanner;

public class _14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = sc.nextInt();
        }
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) { // 삼각형의 조건에 맞지 않는다.
            sides[2] = sides[0] + sides[1] - 1;
            System.out.println(Arrays.stream(sides).sum()); // 생성 가공(실제출력x) 소비
        } else {
            System.out.println(Arrays.stream(sides).sum());
        }

    }
}