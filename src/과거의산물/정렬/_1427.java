package 과거의산물.정렬;

import java.io.*;
import java.util.Scanner;

public class _1427 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int[] arr = new int[10];

        for (int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            arr[num]++;
        }

        for (int i = 9; i >= 0; i--) {
            while (arr[i] > 0) {
                bw.write(Integer.toString(i));
                arr[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}