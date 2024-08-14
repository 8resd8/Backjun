package 과거의산물.심화2;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _26069 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> people = new HashSet<>();
        int count = 0;
        boolean check = false;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String input1 = input[0];
            String input2 = input[1];

            people.add(input1);
            people.add(input2);

            if (people.contains(input1)) {
                count++;
            }
            if (people.contains(input2)) {
                count++;
            }

            if (input2.equals("ChongChong")) {
                count = people.size() - 2;
            } else if (input1.equals("ChongChong")) {
                count = people.size() - 1;
            }


        }
        System.out.println(count);

    }
}