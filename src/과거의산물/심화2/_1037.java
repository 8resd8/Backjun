package 과거의산물.심화2;

import java.io.*;

public class _1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N의 약수의 개수
        String[] input = br.readLine().split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int real = Integer.parseInt(input[i]); // N의 진짜 약수
            min = Math.min(min, real);
            max = Math.max(max, real);
        }
        int result = max * min;
        System.out.println(result);

    }
}