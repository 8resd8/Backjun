package 과거의산물.약수배수와소수2;


import java.io.*;

public class _13909 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // 제곱근의 정수부분
        // 1 ~ 3 = 1, 4 ~ 8 = 2, 9 ~ 15 = 3, 16 ~ 24 = 4 ---
        bw.write((int)Math.sqrt(n) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}