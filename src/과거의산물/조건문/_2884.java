package 과거의산물.조건문;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (hour == 0) {
            hour = 24;
        }

        int alarm = hour * 60 + minute - 45;
        int alarmHour = alarm / 60;

        if (alarm / 60 == 24) {
            alarmHour = 0;
        }

        int alarmMinute = alarm % 60;

        System.out.println(alarmHour + " " + alarmMinute);
    }
}
