package 과거의산물.약수배수와소수2;

import java.io.*;

public class _17103 {

    static boolean[] isPrime;
    public static void checkPrime(int n) {
        isPrime = new boolean[n + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= n; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            int count = 0;

            checkPrime(target * 2);

            for (int j = 2; j <= target / 2; j++) {
                if (!isPrime[j] && !isPrime[target - j]) {
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