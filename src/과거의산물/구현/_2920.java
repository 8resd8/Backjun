package 과거의산물.구현;

import java.util.Scanner;

public class _2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ascending = 1;
        int descending = 8;
        for (int i = 0; i < 8; i++) {
            int n = sc.nextInt();

            if (ascending == n) {
                ascending++;
            }

            if (descending == n) {
                descending--;
            }

        }

        if (ascending == 9) {
            System.out.println("ascending");
        } else if (descending == 0) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}
