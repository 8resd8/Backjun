package 과거의산물.심화1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _25206 {
     public static double getScore(String score) {
        switch (score) {
            case "A+" : return 4.5;
            case "A0" : return 4;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            default: return 0; // P일때는 0
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] object = new String[20];
        double[] point = new double[20];
        double[] score = new double[20];
        double allSum = 0;// 학점 * 과목평점
        int count = -1;
        double pointSum = 0; // 학점의 총합

        Arrays.fill(point, -1);
        Arrays.fill(score, -1);


        while (sc.hasNextLine()) {
            input = sc.nextLine(); // 입력받기
            StringTokenizer stringTokenizer = new StringTokenizer(input, " ");

            while (stringTokenizer.hasMoreTokens()) {
                count++;
                object[count] = stringTokenizer.nextToken(); // 과목 입력
                point[count] = Double.parseDouble(stringTokenizer.nextToken()); // 점수 입력

                String check = stringTokenizer.nextToken(); // P값지 확인을 위해 분리
                score[count] = getScore(check); // 학점을 점수로 바로 변환


                // P인 과목은 아예 제외를 해야한다.
                if (check.equals("P")) {
                    object[count] = "";
                    point[count] = 0;
                    score[count] = -1;
                    count--;
                }
                else {
                    pointSum += point[count];
                    allSum += point[count] * score[count];
                }

            }
        }
        double result = allSum / pointSum;
        System.out.println(result);
    }
}