package 과거의산물.집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _11478 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String temp = "";

        Set<String> set = new HashSet<>();

        for (int i = 1; i < input.length() + 1; i++) {
            for (int j = 0; j < input.length() - i + 1; j++) {
                temp = input.substring(j, j + i);
                set.add(temp);
            }
        }
        System.out.println(set.size());

    }
}