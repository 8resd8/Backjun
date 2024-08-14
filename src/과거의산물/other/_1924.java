package 과거의산물.other;

import java.util.Calendar;
import java.util.Scanner;

public class _1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        String[] engDay = {" ", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(2007, x - 1, y);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(engDay[dayOfWeek]);


    }
}