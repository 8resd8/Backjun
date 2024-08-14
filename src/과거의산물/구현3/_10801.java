package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        int round = 10;
        int aPoint = 0;
        int bPoint = 0;

        for (int i = 0; i < round; i++) {
            int a = Integer.parseInt(A[i]);
            int b = Integer.parseInt(B[i]);
            if (a > b) aPoint++;
            else if (a < b) bPoint++;
        }

        if (aPoint > bPoint) {
            System.out.println("A");
        } else if (aPoint < bPoint) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }


    }
}
