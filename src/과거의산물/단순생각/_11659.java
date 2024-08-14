package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] arr = new int[n];

        // n번의 입력값
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // m번의 입력
        for (int i = 0; i < m; i++) {
            String[] select = br.readLine().split(" ");
            int a = Integer.parseInt(select[0]);
            int b = Integer.parseInt(select[1]);


        }

    }


}