package 과거의산물.구현;

import java.util.Scanner;

public class _10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 높이
            int W = sc.nextInt(); // 길이
            int N = sc.nextInt(); // 사람 수

            // 세로로 아래에서 위로 올라가는 그림
            int count = 0;
            int answerH = N % H;
            int answerW = N / H + 1;

            if (answerH == 0) {
                answerH = H;
                answerW = N / H;
            }
//            for (int j = 1; j <= W; j++) {
//                for (int k = 1; k <= H; k++) {
//                    count++;
//                    if (count == N) {
//                        answerH = k;
//                        answerW = j;
//                        break;
//                    }
//                }
//            }

            System.out.printf("%d%02d\n", answerH, answerW);
        }


    }
}