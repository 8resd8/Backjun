package 과거의산물.other;

import java.util.Scanner;

public class _2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("-");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append(input[i].charAt(0));
        }
        System.out.println(sb);


    }
}