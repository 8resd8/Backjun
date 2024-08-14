package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2303 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().split(" ");
            List<Integer> list = new ArrayList<>();
            int choiceMax = 0;
            for (String s : input) {
                list.add(Integer.parseInt(s));
            }

            for (int j = 0; j < list.size() - 2; j++) {
                for (int k = j + 1; k < list.size() - 1; k++) {
                    for (int l = k + 1; l < list.size(); l++) {
                        choiceMax = Math.max(choiceMax, (list.get(j) + list.get(k) + list.get(l)) % 10);
                    }
                }
            }
            result.add(choiceMax);
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < result.size(); i++) {
            if (max <= result.get(i)) {
                max = result.get(i);
                maxIdx = i + 1;
            }
        }

        System.out.println(maxIdx);

    }


}