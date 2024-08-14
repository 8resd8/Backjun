package 과거의산물.집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class _14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int count = 0;

        Set<String> check = new HashSet<>();
        for (int i = 0; i < n; i++) {
            check.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String inputString = br.readLine();
            if (check.contains(inputString)) {
                count++;
            }
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}