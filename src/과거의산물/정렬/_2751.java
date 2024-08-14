package 과거의산물.정렬;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class _2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for(int value : arr) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}