package 과거의산물.심화1;

import java.util.Locale;
import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String newInput = input.toLowerCase(Locale.ROOT); // 모두 일괄 소문자 변환
        int[] result = new int[27]; // 알파벳 횟수 저장할 공간
        int max = Integer.MIN_VALUE;
        int index = -1;

        // 입력된 알파벳의 횟수 저장
        for (int i = 0; i < newInput.length(); i++) {
            result[newInput.charAt(i) - 'a']++;
        }

        // 최댓값 저장
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
                index = i;
            }

        }

        // 최댓값이 2개 이상 존재하는 경우 확인
        int cnt = 0;
        for (int j : result) {
            if (max == j) {
                cnt++;
            }

            if (cnt > 1) { // 2개 이상 존재하므로 출력 후 종료
                System.out.println("?");
                return;
            }
        }

        // 무사히 나왔다면 정상
        System.out.println((char)(index + 'A'));
    }
}