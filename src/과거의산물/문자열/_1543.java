package 과거의산물.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// https://www.acmicpc.net/problem/1543
public class _1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String search = br.readLine();

        int answer = 0;
        // 1. 과거의산물.문자열 직접 변환
        while (input.contains(search)) {
            input = input.replaceFirst(search, "-");
            answer++;
        }

        // 2. 과거의산물.문자열 순서 이동
//        int index = 0;
//        while ((index = input.indexOf(search, index)) != -1) {
//            answer++;
//            index += search.length();
//        }

        System.out.println(answer);


    }
}