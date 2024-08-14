package 과거의산물.집합과맵;

import java.io.*;
import java.util.HashMap;

public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input  = br.readLine().split(" ");
        HashMap<Integer, Integer> count = new HashMap<>();

        // 내 카드를 입력받기
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input[i]);
            // 키가 존재하는 경우 키에대한 밸류값에 1을 더해준다.
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        // 확인할 카드 입력 받기
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(input[i]);
            sb.append(count.getOrDefault(num, 0)).append(" ");
        }
        System.out.println(sb);

    }
}