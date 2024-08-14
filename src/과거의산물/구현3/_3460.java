package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            int input = Integer.parseInt(br.readLine());
            String binary = Integer.toBinaryString(input);
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    list.add(binary.length() - j - 1);
                }
            }
            Collections.sort(list);
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }


    }
}
