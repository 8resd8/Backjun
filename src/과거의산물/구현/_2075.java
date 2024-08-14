package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            for (String s : input) {
                arr[index++] = Integer.parseInt(s);
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[n * n - n]);



    }
}
