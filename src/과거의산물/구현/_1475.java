package 과거의산물.구현;

import java.util.Scanner;

public class _1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = new int[10];

        for (int i = 0; i < input.length(); i++) {
            int number = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (number == 6 && arr[9] < arr[number]) {
                arr[9]++;
            } else if (number == 9 && arr[6] < arr[number]) {
                arr[6]++;
            } else {
                arr[number]++;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = Math.max(count, arr[i]);
        }
        System.out.println(count);


    }
}
