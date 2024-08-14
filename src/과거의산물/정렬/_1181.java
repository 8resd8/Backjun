package 과거의산물.정렬;

import java.io.*;
import java.util.*;

public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> input = new ArrayList<>();

        // 중복된 값을 제외하고 배열에 넣기
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (!input.contains(s)) {
                input.add(s);
            }
        }
        // Collections.sort(input, (a, b) -> {}); 이거랑 같은데 IDE에서 이것도 된다고함.
        // ArrayList자체 함수에 sort가 있다고 하네요
        input.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });

        StringBuilder sb = new StringBuilder();

        for (String word: input){
            sb.append(word).append('\n');
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}