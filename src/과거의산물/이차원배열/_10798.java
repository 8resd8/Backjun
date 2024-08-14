package 과거의산물.이차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class _10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[5];
        int maxLength = 0;

        // 입력 받은 값의 최대 길이
        for (int i = 0; i < 5; i++) {
            input[i] = sc.nextLine();
            maxLength = Math.max(maxLength, input[i].length());
        }

        // 출력할 과거의산물.문자열 길이 선언
        String[][] output = new String[5][maxLength];

        // 빈 요소 전부 공백으로 초기화
        for (String[] row : output) {
            Arrays.fill(row, "");
        }

        // output 값 넣기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                output[i][j] = String.valueOf(input[i].charAt(j));
            }
        }

        // 출력
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%s", output[j][i]);
            }
        }

    }
}