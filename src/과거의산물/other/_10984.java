package 과거의산물.other;

import java.util.Scanner;

public class _10984 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int totalPoint = 0;
            double totalGPA = 0;

            for (int j = 0; j < N; j++) {
                int point = sc.nextInt();
                double GPA = sc.nextDouble();

                totalPoint += point;
                totalGPA += point * GPA;
            }
            System.out.printf("%d %.1f\n", totalPoint, totalGPA / totalPoint);
        }


    }
}