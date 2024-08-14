package 과거의산물.구현;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }


        Collections.sort(list);
        System.out.println(list.get(1));

    }
}
