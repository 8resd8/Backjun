package Backjoon.gold.g5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 탑_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        StringBuilder answer = new StringBuilder(); // 결과 저장
        int[] inputList = new int[n];
        Stack<Integer> index = new Stack<>();
        Stack<Integer> top = new Stack<>();

        for (int i = 0; i < n; i++) {
            inputList[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n; i++) {
            index.push(i); // 타워의 인덱스

            // 수신이 성공할 때까지, 비교 대상이 작으면 삭제
            while (!top.isEmpty() && !index.isEmpty() && top.peek() < inputList[i]) {
                top.pop();
                index.pop();
            }

            if (top.isEmpty()) { // 수신이 실패한 경우
                answer.append(0).append(" ");
            } else {
                answer.append(index.peek()).append(" ");
            }

            top.push(inputList[i]); // 타워의 길이
        }


        System.out.println(answer);
    }
}