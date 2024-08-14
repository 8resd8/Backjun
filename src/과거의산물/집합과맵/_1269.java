package 과거의산물.집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1269 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        int a = Integer.parseInt(nm[0]);
        int b = Integer.parseInt(nm[1]);

        Set<Integer> setA = new HashSet();
        Set<Integer> setB = new HashSet();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(input[i]);
            setA.add(num);
        }

        input = br.readLine().split(" ");
        for (int i = 0; i < b; i++) {
            int num = Integer.parseInt(input[i]);
            setB.add(num);
        }

        int count = 0;
        for(int i: setA) {
            if (!setB.contains(i)) {
                count++;
            }
        }

        for(int i: setB) {
            if (!setA.contains(i)) {
                count++;
            }
        }
        System.out.println(count);


    }
}