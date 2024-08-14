package 과거의산물.정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" "); // A, B의 크기

        List<Integer> list = new ArrayList<>();
        String[] values = br.readLine().split(" ");
        for (String value : values) {
            int number = Integer.parseInt(value);
            list.add(number);
        }

        values = br.readLine().split(" ");
        for (String value : values) {
            int number = Integer.parseInt(value);
            list.add(number);
        }

        Collections.sort(list);

        for (int i : list) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}