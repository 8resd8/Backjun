package 과거의산물.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(input[i]));
        }

        Collections.sort(arr);

        int target = Integer.parseInt(br.readLine());
        int count = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr.get(left) + arr.get(right);
            if (sum == target) {
                count++;
                left++;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);


    }
}