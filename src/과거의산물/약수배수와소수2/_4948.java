package 과거의산물.약수배수와소수2;

import java.io.*;

public class _4948 {

    static boolean[] isPrime;

    public static void checkPrime(int number) {
        isPrime = new boolean[number + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= number; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 제한조건 : 1 <= n <= 123,456
        checkPrime(123_456 * 2);

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            if (n == 0) {
                break;
            }

            // n보다 크고, 2n보다 작거나 같은 소수
            for (int i = n + 1; i <= n * 2; i++) {
                if (!isPrime[i]) {
                    count++;
                }
            }
            bw.write(count + "\n");

        }
        bw.flush();
        bw.close();
        br.close();

    }
}