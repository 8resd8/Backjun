package 과거의산물.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 10;
        int wantSize = size - 3;

        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.println(list.get(wantSize));
        }


    }
}