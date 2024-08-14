package 과거의산물.other;

import java.io.*;

public class _1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[27];

        for (int i = 0; i < 50; i++) {
            String input = br.readLine();
            if (input == null) {
                break;
            }

            for (int j = 0; j < input.length(); j++) {
                int num = input.charAt(j) - 'a'; // a = 0, b = 1
                if (num < 0 || num > 26) {
                    continue;
                }
                alpha[num]++;
            }

        }

        int max = 0;
        for(int i: alpha) {
            max = Math.max(max, i);
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] >= max) {
                System.out.print((char)(i + 'a'));
            }
        }
        System.out.println();


    }
}