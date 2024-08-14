package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");

            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[2]);
            long inputAnswer = Long.parseLong(input[4]);

            switch (input[1]) {
                case "+" -> System.out.println(a + b == inputAnswer ? "correct" : "wrong answer");
                case "-" -> System.out.println(a - b == inputAnswer ? "correct" : "wrong answer");
                case "*" -> System.out.println(a * b == inputAnswer ? "correct" : "wrong answer");
                case "/" -> System.out.println(a / b == inputAnswer ? "correct" : "wrong answer");
                default -> throw new IllegalStateException("Unexpected value: " + input[1]);
            }
        }


    }
}
