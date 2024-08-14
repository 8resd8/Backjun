package 과거의산물.일반수학1;

import java.util.Scanner;

public class _13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시험장
        int[] students = new int[N];
        for (int i = 0; i < N; i++) {
            students[i] = sc.nextInt();
        }

        int B = sc.nextInt(); // 총 감독관이 감시하는 학생
        int C = sc.nextInt(); // 부감독관이 감시하는 학생
        long count = 0;

        for (int student : students) {
            count++; // 총 감독관 한명 배치
            int remainStudent = student - B;

            if (remainStudent > 0) {
                count += Math.ceil((double) remainStudent / C);
            }
        }
        System.out.println(count);

    }
}