package 과거의산물.구현;

import java.util.Arrays;

public class _4673 {
    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];
        Arrays.fill(arr, false); // 정답은 false

        for (int i = 1; i <= 10000; i++) {
            int temp = i;
            int sum = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum < 10001) {
                arr[sum] = true;
            }

        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }


    }
}