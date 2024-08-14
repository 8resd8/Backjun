package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class _3059 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            int result = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (char c : input.toCharArray()) {
                arrayList.add((int) c);
            }

            for (char c : alpha.toCharArray()) {
                if (!arrayList.contains((int) c)) {
                    result += c;
                }
            }
            System.out.println(result);


        }


    }
}