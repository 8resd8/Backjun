package 과거의산물.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hashMap = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");
                String clotheType = input[1];
                hashMap.put(clotheType, hashMap.getOrDefault(clotheType, 0) + 1);

            }
            // 모든 조합 계산
            int answer = 1;
            for (Integer value : hashMap.values()) {
                answer *= (value + 1); // 종류별 의상을 입거나 안입는 상태
            }
            System.out.println(answer - 1); // 모든 옷을 안입는 상태 제외


        }

    }
}