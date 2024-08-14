package 과거의산물.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long startTime = System.nanoTime();

        int E = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int M = Integer.parseInt(input[2]);

        int earth = 0;
        int sun = 0;
        int moon = 0;

        int count = 0;
        while (true) {
            if (earth == E && sun == S && moon == M) {
                System.out.println(count);
                break;
            }

            earth++;
            sun++;
            moon++;

            if (earth == 16) {
                earth = 1;
            }
            if (sun == 29) {
                sun = 1;
            }
            if (moon == 20) {
                moon = 1;
            }
            count++;

        }

        long endTime = System.nanoTime();
        long resultTime = endTime - startTime;
        System.out.println(resultTime);
        System.out.println((double) resultTime / 1000000);



    }
}