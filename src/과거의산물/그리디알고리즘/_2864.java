package 과거의산물.그리디알고리즘;

import java.io.*;

public class _2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int min = 0;
        int max = 0;

        String minS = input[0].replace("6", "5");
        String minS2 = input[1].replace("6", "5");
        min = Integer.parseInt(minS) + Integer.parseInt(minS2);

        String maxS = input[0].replace("5", "6");
        String maxS2 = input[1].replace("5", "6");

        max = Integer.parseInt(maxS) + Integer.parseInt(maxS2);


        System.out.println(min + " " + max);

    }
}