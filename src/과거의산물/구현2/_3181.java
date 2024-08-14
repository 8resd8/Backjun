package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] includeWords = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
        StringBuilder sb = new StringBuilder();


        boolean first = true;
        for (String sentence : input) {
            if (Arrays.stream(includeWords).noneMatch(sentence::equals) || first) {
                sb.append(Character.toUpperCase(sentence.charAt(0)));
            }
            first = false;
        }


        System.out.println(sb);
    }
}