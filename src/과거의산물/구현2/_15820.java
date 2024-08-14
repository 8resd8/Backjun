package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int sampleT = Integer.parseInt(t[0]);
        int systemT = Integer.parseInt(t[1]);

        boolean sampleTest = sampleTestCase(sampleT, br);
        boolean systemTest = systemTestCase(systemT, br);

        if (sampleTest && systemTest) {
            System.out.println("Accepted");
        } else if (!sampleTest) {
            System.out.println("Wrong Answer");
        } else {
            System.out.println("Why Wrong!!!");
        }

    }

    private static boolean sampleTestCase(int testCase, BufferedReader br) throws IOException {
        for (int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            long answer = Integer.parseInt(input[0]);
            long manyeongAnswer = Integer.parseInt(input[1]);
            if (answer != manyeongAnswer) {
                return false;
            }
        }
        return true;
    }

    private static boolean systemTestCase(int testCase, BufferedReader br) throws IOException {
        for (int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            long answer = Integer.parseInt(input[0]);
            long manyeongAnswer = Integer.parseInt(input[1]);
            if (answer != manyeongAnswer) {
                return false;
            }
        }
        return true;
    }
}