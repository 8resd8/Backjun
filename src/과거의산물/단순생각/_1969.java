package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }
        StringBuilder stringResult = new StringBuilder();
        int total = 0;

        for (int i = 0; i < M; i++) {
            int[] ACGTCount = new int[4];
            for (String s : list) {
                switch (s.charAt(i)) {
                    case 'A':
                        ACGTCount[0]++;
                        break;
                    case 'C':
                        ACGTCount[1]++;
                        break;
                    case 'G':
                        ACGTCount[2]++;
                        break;
                    case 'T':
                        ACGTCount[3]++;
                        break;
                }
            }

            int maxIndex = 0;
            for (int j = 1; j < 4; j++) {
                if (ACGTCount[j] > ACGTCount[maxIndex]) {
                    maxIndex = j;
                }
            }

            char ACGT = "ACGT".charAt(maxIndex);
            stringResult.append(ACGT);

            for (String dna : list) {
                if (dna.charAt(i) != ACGT) {
                    total++;
                }
            }
        }


        System.out.println(stringResult);
        System.out.println(total);
    }
}