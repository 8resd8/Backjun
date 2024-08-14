package A알아두면좋을만한것들;

import java.util.StringTokenizer;

public class SplitVsTokenizer {
    public static void main(String[] args) {
        // 매우 큰 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10_000_000; i++) {
            sb.append("test ");
        }
        String largeStr = sb.toString();

        // String.split() 속도 테스트
        long startTime = System.currentTimeMillis();
        String[] parts = largeStr.split(" ");
        long endTime = System.currentTimeMillis();
        System.out.println("String.split() Time: " + (endTime - startTime) + " ms");

        // StringTokenizer 속도 테스트
        startTime = System.currentTimeMillis();
        StringTokenizer tokenizer = new StringTokenizer(largeStr, " ");
        while (tokenizer.hasMoreTokens()) {
            tokenizer.nextToken();
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringTokenizer Time: " + (endTime - startTime) + " ms");
    }
}
