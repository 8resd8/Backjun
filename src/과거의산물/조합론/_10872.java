package 과거의산물.조합론;

import java.io.*;

public class _10872 {

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(n));

    }
}