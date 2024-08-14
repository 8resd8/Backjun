package 과거의산물.일반수학1;

import java.util.Scanner;

public class _1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 1;
        int line = 1;
        // 대각선의 합은 2, 3, 4, 5 증가함

        // 몇번째 대각선 까지 갈건지 확인
        while (input > sum){
            line++;
            sum += line; //1 + 2 + 3 + 4 + 5 늘어남
        }

        int diff = sum - input;
        int left, right;

        if (line % 2 == 1) {
            left = diff + 1;
            right = line - diff;
        } else {
            left = line - diff;
            right = diff + 1;
        }

        System.out.println(left + "/" + right);


    }
}