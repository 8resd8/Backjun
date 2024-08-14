package 과거의산물.other;

import java.time.LocalDate;

public class _10699 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.printf("%04d-%02d-%02d\n", currentDate.getYear(), currentDate.getMonthValue(), currentDate.getDayOfMonth());


    }
}