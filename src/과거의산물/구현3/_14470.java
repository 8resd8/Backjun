package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int basicMeat = Integer.parseInt(br.readLine());
        int targetTemp = Integer.parseInt(br.readLine());
        int frozenMeatBakeTime = Integer.parseInt(br.readLine());
        int meltTime = Integer.parseInt(br.readLine());
        int unfrozenMeatBakeTime = Integer.parseInt(br.readLine());
        int answer = 0;

        // 얼어있는 상태일 때
        if (basicMeat < 0) {
            answer += Math.abs(frozenMeatBakeTime * basicMeat); // 0도까지 데우는 시간
            answer += meltTime; // 해동시간
            answer += targetTemp * unfrozenMeatBakeTime; // 목표 온도까지 데우는 시간

        } else {
            if (basicMeat == targetTemp) {
                System.out.println(basicMeat);
            } else {
                answer += ((targetTemp - basicMeat) * unfrozenMeatBakeTime);
            }
        }

        System.out.println(answer);


    }
}
