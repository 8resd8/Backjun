package 과거의산물.구현;

import java.io.IOException;
import java.util.Scanner;

public class _13300 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 총 인원 수
        int k = sc.nextInt(); // 한 방의 최대 배정 인원

        int[][] rooms = new int[2][7]; // 남자 여자, 6학년까지
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt(); // 성별 (여자 = 0, 남자 = 1)
            int y = sc.nextInt(); // 학년
            rooms[s][y]++;
        }

        int room = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                double number = rooms[i][j];
                if (number == 0) continue; // 방에 아무도 없으면 패스

                room += (int) Math.ceil(number / k); // 사람은 0.x명, 1.x명 존재 하지 않음
            }
        }
        System.out.println(room);


    }
}