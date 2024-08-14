package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 10;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i + 1);
        }

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;

            selectReverse(list, a, b);
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }


    }

    private static void selectReverse(List<Integer> list, int a, int b) {
        for (int i = a; i < b; i++) {
            int temp = list.get(i);
            list.set(i, list.get(b));
            list.set(b--, temp);
        }
    }
}
