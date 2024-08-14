package 과거의산물.심화1;

import java.util.Scanner;

public class _3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answerChest = new int[]{1, 1, 2, 2, 2, 8};
        int[] input = new int[6];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
//            System.out.printf("%d ", answerChest[i] > input[i] ?
//            answerChest[i] - input[i] : input[i] - answerChest[i]);
            System.out.printf("%d ", answerChest[i] - input[i]);
        }
    }
}