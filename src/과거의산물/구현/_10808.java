package 과거의산물.구현;

import java.util.Scanner;

public class _10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i < input.length(); i++) {
            int number = Integer.parseInt(String.valueOf((input.charAt(i)) - 'a'));
            arr[number]++;
        }

        for (int i :
                arr) {
            System.out.print(i + " ");
        }


    }
}