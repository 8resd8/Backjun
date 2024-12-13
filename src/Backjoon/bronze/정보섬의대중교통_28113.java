package Backjoon.bronze;

// https://www.acmicpc.net/problem/28113

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정보섬의대중교통_28113 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // to SubwayTime
        int A = Integer.parseInt(st.nextToken()); // Bus
        int B = Integer.parseInt(st.nextToken()); // Subway

        if (N > B) B *= 2;

        if (A < B) {
            System.out.println("Bus");
        } else if (A > B) {
            System.out.println("Subway");
        } else {
            System.out.println("Anything");
        }
    }
}
