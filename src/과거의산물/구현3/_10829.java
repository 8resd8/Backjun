package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }


        System.out.println(sb.reverse());
    }
}