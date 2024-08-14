package A알아두면좋을만한것들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유클리드호제법 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int 최대공약수 = euclidean(a, b);
            int 최소공배수 = a * b / 최대공약수;
            System.out.print(최소공배수 + " " + 최대공약수 + "\n");
        }


    }

    private static int euclidean(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidean(b, a % b);
    }
}
