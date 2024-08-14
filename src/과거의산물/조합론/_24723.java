package 과거의산물.조합론;

import java.io.*;
import java.util.Scanner;

public class _24723 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(2, n));

    }
}