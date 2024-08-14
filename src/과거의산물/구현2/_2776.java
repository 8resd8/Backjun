package 과거의산물.구현2;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class _2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n1 = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            String[] input = br.readLine().split(" ");

            // 점수 기록
            for (String s : input) {
                int number = Integer.parseInt(s);
                set.add(number);
            }

            int n2 = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();

            // 점수 포함시 1 없다면 0
            for (String s : input) {
                int number = Integer.parseInt(s);
                if (set.contains(number)) {
                    sb.append(1).append("\n");
                    continue;
                }
                sb.append(0).append("\n");
            }
            bw.write(String.valueOf(sb));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}