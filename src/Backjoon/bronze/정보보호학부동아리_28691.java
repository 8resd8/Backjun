package Backjoon.bronze;

// https://www.acmicpc.net/problem/28691

import java.io.*;

public class 정보보호학부동아리_28691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if ("M".equals(input)) {
            System.out.println("MatKor");
        } else if ("W".equals(input)) {
            System.out.println("WiCys");
        } else if ("C".equals(input)) {
            System.out.println("CyKor");
        } else if ("A".equals(input)) {
            System.out.println("AlKor");
        } else {
            System.out.println("$clear");
        }
    }
}
