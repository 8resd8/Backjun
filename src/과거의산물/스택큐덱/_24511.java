package 과거의산물.스택큐덱;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class _24511 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            for (int j = 0; j < input.length; j++) {
                int number = Integer.parseInt(input[i]);
                stack.push(number);
                queue.offer(stack.pop());
                int x = queue.poll();
            }
        }


    }
}