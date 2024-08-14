package 과거의산물.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] list = new int[t];
        for (int i = 0; i < t; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int[] distance = new int[t - 1];
        // 나무 사이의 간격들
        for (int i = 1; i < t; i++) {
            distance[i - 1] = list[i] - list[i - 1];
        }


        int gab = distance[0];
        for (int i = 1; i < distance.length; i++) {
            gab = Uclid(gab, distance[i]);
        }

        int answer = 0;
        for (int i : distance) {
            answer += (i / gab) - 1;
            // 간격이 6이고 간격이 2라면 3개의 구간이 생김, 2 4 6 하지만 구간 사이에 심어서 -1
        }

        System.out.println(answer);
    }

    public static int Uclid(int a, int b) {
        if (b == 0)
            return a;

        return Uclid(b, a % b);
    }
}