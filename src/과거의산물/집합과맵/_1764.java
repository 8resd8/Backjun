package 과거의산물.집합과맵;

import java.io.*;
import java.util.TreeSet;

public class _1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        TreeSet<String> inputName = new TreeSet<>();
        TreeSet<String> result = new TreeSet<>();


        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            inputName.add(name);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (inputName.contains(name)) {
                result.add(name);
                count++;
            }
        }

        bw.write(count + "\n");
        for (String s: result) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}