package 과거의산물.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10870 {

    static int Fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(Fibonacci(n)));

        bw.flush();
        bw.close();
        br.close();

    }
}