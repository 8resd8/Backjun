package 입출력과사칙연산.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static int N, M, max;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static TreeMap<Integer, Integer> result = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input.length() < 3) {
            System.out.println("CE");
        } else if (input.charAt(0) == '"' && input.charAt(input.length() - 1) == '"') {
            for (int i = 1; i < input.length() - 1; i++) {
                System.out.print(input.charAt(i));
            }
        } else {
            System.out.println("CE");
        }
    }
}