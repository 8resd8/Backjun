package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _9375dontKnwo {

    static int combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return combination(n - 1, r - 1) + combination(n - 1, r);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int line = Integer.parseInt(br.readLine());
            HashMap<String, Integer> closet = new HashMap<>();
            Set<String> size = new HashSet<>();

            for (int j = 0; j < line; j++) {
                String[] input = br.readLine().split(" ");
                closet.put(input[1], closet.getOrDefault(input[1], 0) + 1); // 0 : 옷, 1 : 타입
                size.add(input[1]);
            }

            for (Map.Entry<String, Integer> entry : closet.entrySet()) {
                int closetSize = size.size();
                while (closetSize > 0) {
                    sum += combination(entry.getValue(), closetSize--);
                }

            }

            System.out.println(sum);
        }


    }
}
