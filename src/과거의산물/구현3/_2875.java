package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int female = Integer.parseInt(input[0]);
        int male = Integer.parseInt(input[1]);
        int internShip = Integer.parseInt(input[2]);

        // 여자가 홀수인 경우는 의미가 없음, 인턴으로 한명 확정 보낸다.
        if (female % 2 == 1) {
            female--;
            internShip--;
        }

        int womanTeam = female / 2;
        int canMakeTeam = Math.min(womanTeam, male);
        int tempWoman = Math.abs(canMakeTeam - womanTeam);
        int tempMan = Math.abs(canMakeTeam - male);

        internShip -= (tempWoman * 2 + tempMan);

        // 여유인원 다 보냈는데 부족한 경우
        while (internShip > 0) {
            canMakeTeam--;
            internShip -= 3;
        }
        System.out.println(canMakeTeam);


    }
}
