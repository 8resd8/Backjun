package 과거의산물.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2960 {

    static boolean[] arr;
    static int count;

    public static int findSosu(int n, int k) {
        // 소수 = true
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }

        // 소수 = true
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                if (++count == k) {
                    return i;
                }
                for (int j = i * i; j <= n; j += i) {
                    if (!arr[j]) {
                        continue;
                    }
                    arr[j] = false;
                    if (++count == k) {
                        return j;
                    }
                }

            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        arr = new boolean[n * 10];

        System.out.println(findSosu(n, k));

    }
}