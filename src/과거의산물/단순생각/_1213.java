package 과거의산물.단순생각;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 문자의 빈도 저장
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (Integer value : frequency.values()) {
            if (value % 2 != 0) {
                oddCount++;
            }
        }

        // 홀수인 문자가 2개 이상이면 팰린드롬이 아니다. (문자 1개는 팰린드롬)
        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        // 사전순 팰린드롬 만들기
        StringBuilder sb = new StringBuilder();
        Character middle = null; // 중앙 문자

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count % 2 != 0) {
                middle = c;
                count--;
            }
            char[] chars = new char[count / 2]; // 중앙문자 빼고 절만만 구성 (나중에 뒤집어서 추가)
            Arrays.fill(chars, c);
            sb.append(chars);
        }

        // 사전순으로 만들기
        // 과거의산물.문자열 과거의산물.정렬 위해서는 char[]로 바꿔서 과거의산물.정렬
        char[] halfC = sb.toString().toCharArray();
        Arrays.sort(halfC);
        String sorted = new String(halfC);
        StringBuilder answer = new StringBuilder();
        answer.append(sorted);

        if (middle != null) {
            answer.append(middle);
        }

        // 뒤에 뒤집어서 문자 추가
        answer.append(new StringBuilder(new String(halfC)).reverse());
        System.out.println(answer);
    }
}