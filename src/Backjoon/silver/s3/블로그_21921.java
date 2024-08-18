package Backjoon.silver.s3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/21921
public class 블로그_21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NX = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(NX[0]);
        int X = Integer.parseInt(NX[1]);

        int[] visit = new int[N];
        for (int i = 0; i < N; i++) {
            visit[i] = Integer.parseInt(st.nextToken());
        }

        // 초기값 설정
        int period = 0;
        int maxVisit = 0;
        int nowVisit = 0;
        for (int i = 0; i < X; i++) {
            nowVisit += visit[i];
        }

        if (checkAnswer(maxVisit, nowVisit)) {
            maxVisit = nowVisit;
            period++;
        }

        for (int i = X; i < N; i++) {
            int pre = visit[i - X];
            int after = visit[i];
            int currentVisit = nowVisit - pre + after;

            if (currentVisit == maxVisit) period++; // 현재 방문이 최대랑 같다면 기간 + 1
            if (checkAnswer(maxVisit, currentVisit)) { // 최대 방문일이 갱신이 되는 순간
                period = 1; // 기간은 1로 바뀐다
                maxVisit = currentVisit;
            }
            nowVisit = currentVisit;
        }


        if (maxVisit == 0) {
            System.out.println("SAD");
            return;
        }
        System.out.println(maxVisit);
        System.out.println(period);
    }

    private static boolean checkAnswer(int maxVisit, int currentVisit) {
        return maxVisit < currentVisit;
    }
}