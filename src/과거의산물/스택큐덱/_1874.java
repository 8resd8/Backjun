package 과거의산물.스택큐덱;
// https://www.acmicpc.net/problem/1874

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class _1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int current = 1; // push 숫자
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // 수열 다음 숫자

            while (current <= num) {
                stack.push(current);
                current++;
                sb.append("+\n");
            }

            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else  {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);



    }
}