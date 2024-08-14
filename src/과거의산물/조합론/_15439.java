package 과거의산물.조합론;

import java.io.*;

public class _15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write((n - 1) * n + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}