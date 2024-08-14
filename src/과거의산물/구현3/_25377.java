package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int minTime = Integer.MAX_VALUE;
        boolean possible = false;

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int goStoreTime = Integer.parseInt(input[0]);
            int waitBread = Integer.parseInt(input[1]);


            if (goStoreTime <= waitBread) { // 도착했는데 빵이 아직 안나옴
                minTime = Math.min(minTime, waitBread);
                possible = true;
            }
        }


        System.out.println(possible ? minTime : -1);
    }
}