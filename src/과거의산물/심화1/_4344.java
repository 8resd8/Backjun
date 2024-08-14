package 과거의산물.심화1;

import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int testCase = 0; testCase < n; testCase++) {
            int student = sc.nextInt();
            double[] studentScore = new double[student];
            int sum = 0;

            // 학생들의 점수 입력
            for (int i = 0; i < student; i++) {
                studentScore[i] = sc.nextInt();
                sum += studentScore[i];
            }

            // 평균 구하기
            double avg = sum / student;

            // 평균 이상의 학생 수 구하기
            int overAvgNum = 0;
            for (int i = 0; i < studentScore.length; i++) {
                if (avg < studentScore[i]) {
                    overAvgNum++;
                }
            }

            // 결과 출력
            double result = overAvgNum / (double)student * 100;
            System.out.printf("%.3f%%\n", result);
        }
    }
}