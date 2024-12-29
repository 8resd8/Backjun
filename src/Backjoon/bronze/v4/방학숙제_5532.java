package Backjoon.bronze.v4;

// https://www.acmicpc.net/problem/5532

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 방학숙제_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine()); // 국어
        int B = Integer.parseInt(br.readLine()); // 수학
        int C = Integer.parseInt(br.readLine()); // 최대 국어
        int D = Integer.parseInt(br.readLine()); // 최대 수학

        int kor = (int) Math.ceil((double) A / C);
        int math = (int) Math.ceil((double) B / D);
        int studyDay = Math.max(kor, math);

        System.out.println(L - studyDay);
    }
}
