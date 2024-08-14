package 과거의산물.스택큐덱;

import java.io.*;
import java.util.*;

public class _2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cards.add(i + 1);
        }

        while (!cards.isEmpty()) {
            result.add(cards.poll()); // 제일 위 카드를 버린다.
            cards.offer(cards.peek()); // 제일 위 카드를 아래로 없앤다.
            cards.remove();
        }

        for (int i : result) {
            System.out.print(i + " ");
        }


    }
}