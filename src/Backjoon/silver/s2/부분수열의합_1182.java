package 입출력과사칙연산.src.Backjoon.silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 부분수열의합_1182{
    static int N, S;
    static ArrayList<Integer> numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NS = br.readLine().split(" " );
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(NS[0]);
        S = Integer.parseInt(NS[1]);
        numbers = new ArrayList<>();
        while (st.hasMoreTokens()) numbers.add(Integer.parseInt(st.nextToken()));

        permutation();

    }
}
