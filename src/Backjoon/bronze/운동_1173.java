package Backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 운동_1173 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 운동 시간
        int m = Integer.parseInt(st.nextToken()); // 초기 맥박, 최저 맥박
        int M = Integer.parseInt(st.nextToken()); // 이 값보다 작거나 같아야 함
        int T = Integer.parseInt(st.nextToken()); // 증가하는 수
        int R = Integer.parseInt(st.nextToken()); // 감소하는 수
        int heart = m;

        // 경계 케이스 확인, 최저맥박 + 증가맥박이 M보다 커버리면 절대 불가
        if (m + T > M) {
            System.out.println(-1);
            return;
        }

        int exercise = 0;
        int time = 0;
        while (true) {
            if (N == exercise) break;

            if (heart + T <= M) {
                exercise++;
                heart += T;
            } else {
                heart = Math.max(m, heart - R);
            }

            time++;
        }
        System.out.println(time);
    }
}