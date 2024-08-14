package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        calculation(a, b, c);


    }

    private static void calculation(int a, int b, int c) {
        char 부호 = ' ';
        boolean check = true;
        if (a + b == c) {
            부호 = '+';
        } else if (a - b == c) {
            부호 = '-';
        } else if (a * b == c) {
            부호 = '*';
        } else if (a / b == c){
            부호 = '/';
        }

        if (b + c == a) {
            부호 = '+';
            check = false;
        } else if (b - c == a) {
            부호 = '-';
            check = false;
        } else if (b * c == a) {
            부호 = '*';
            check = false;
        } else if (b / c == a){
            부호 = '/';
            check = false;
        }

        if (check) {
            printCResult(a, b, c, 부호);
        } else {
            printAResult(a, b, c, 부호);
        }


    }

    private static void printCResult(int a, int b, int c, char d) {
        System.out.printf("%d%c%d=%d", a, d, b, c);
    }

    private static void printAResult(int a, int b, int c, char d) {
        System.out.printf("%d=%d%c%d", a, b, d, c);
    }

}