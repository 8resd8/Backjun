package 과거의산물.일반수학1;

import java.util.Scanner;

public class _2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int activity = sc.nextInt(); // 올라가기
        int down = sc.nextInt();    // 내려가기
        int lengthH = sc.nextInt(); // 목표치

        // 실행 시간 측정 시작
        long startTime = System.currentTimeMillis();

        int result = (lengthH - down) / (activity - down);
        if ((lengthH - down) % (activity - down) != 0) {
            result++;
        }
        System.out.println(result);




        // 실행 시간 측정 종료
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

//        System.out.println("실행 시간: " + executionTime + "ms");


    }
}