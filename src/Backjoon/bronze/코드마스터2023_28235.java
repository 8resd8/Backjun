package Backjoon.bronze;

// https://www.acmicpc.net/problem/28235

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 코드마스터2023_28235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if ("SONGDO".equals(input)) {
            System.out.println("HIGHSCHOOL");
        } else if ("CODE".equals(input)) {
            System.out.println("MASTER");
        } else if ("2023".equals(input)) {
            System.out.println("0611");
        } else {
            System.out.println("CONTEST");
        }
    }
}
