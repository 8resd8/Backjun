package 과거의산물.집합과맵;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> input = new HashSet<>();
        String[] log;

        for (int i = 0; i < n; i++) {
            log = br.readLine().split(" ");
            String name = log[0];
            String status = log[1];

            if (status.equals("leave")) {
                input.remove(name);
            } else if (status.equals("enter")){
                input.add(name);
            }
        }

        ArrayList<String> user = new ArrayList<>(input);
        Collections.sort(user, Collections.reverseOrder());
        for (String s:
             user) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}