package 과거의산물.그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1931 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 10만 x 10만 = 100억..?
        int[][] meeting = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            meeting[i][0] = Integer.parseInt(input[0]);
            meeting[i][1] = Integer.parseInt(input[1]);
        }
//        Arrays.sort(meeting, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(meeting, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        int maxRoom = 1;
        int endAndStartTime = meeting[0][1];
        for (int i = 1; i < n; i++) {
            if (endAndStartTime <= meeting[i][0]) {
                maxRoom++;
                endAndStartTime = meeting[i][1];
            }

        }
        System.out.println(maxRoom);


    }
}