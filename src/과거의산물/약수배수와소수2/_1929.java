package 과거의산물.약수배수와소수2;

import java.io.*;

public class _1929 {

    static boolean[] isPrime;
    public static void checkPrime(int number) {
        isPrime = new boolean[number + 1];

        // 소수가 아니라면 true (초기값은 false되어있다)
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= number; i++) {

            // 소수가 아니라면 그의 배수는 모두 소수가 아니다.
            if (!isPrime[i]) {
                for (int j = i * i; j <= number; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        // a ~ b까지의 소수를 구하기 때문에 b까지의 소수를 모두 구해놓기
        checkPrime(b);

        for (int i = a; i <= b; i++) {
            if (!isPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);

    }
}