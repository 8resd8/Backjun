package 과거의산물.그리디알고리즘;

import java.io.*;

public class _11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[] caseN = new int[10];

        for (int i = 0; i < n; i++) {
            caseN[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k / caseN[i] > 0) {
                count += k / caseN[i];
                k %= caseN[i];
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();

    }
}