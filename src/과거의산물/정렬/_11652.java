package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long input = Long.parseLong(br.readLine());
            hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
        }

        int maxCount = 0;
        long maxNumber = Long.MAX_VALUE;

        for (Map.Entry<Long, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxCount || (entry.getValue() == maxCount && entry.getKey() < maxNumber)) {
                maxCount = entry.getValue();
                maxNumber = entry.getKey();
            }
        }


        System.out.println(maxNumber);
    }
}