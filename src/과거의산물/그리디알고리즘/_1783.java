package 과거의산물.그리디알고리즘;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1783 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int answer = getAnswer(N, M);
        System.out.println(answer);

    }

    private static int getAnswer(int n, int m) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return Math.min((m + 1) / 2, 4);
        }
        if (m < 7) {
            return Math.min(m, 4);
        }

        return m - 2;
    }
}