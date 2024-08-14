package A알아두면좋을만한것들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = null;

        // 3단어로 나누기
        int len = input.length(); // 1
        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                // 0부터 i까지, i부터 j까지, j부터 끝까지
                String part1 = input.substring(0, i);
                String part2 = input.substring(i, j);
                String part3 = input.substring(j);

                // 단어 뒤집고 합치기
                String reverseWord = reverseWord(part1) + reverseWord(part2) + reverseWord(part3);

                // 사전순 과거의산물.정렬 0보다 작으면 오름차순
                if (answer == null || reverseWord.compareTo(answer) < 0) {
                    answer = reverseWord;
                }

            }
        }


        System.out.println(answer);
    }

    private static String reverseWord(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
