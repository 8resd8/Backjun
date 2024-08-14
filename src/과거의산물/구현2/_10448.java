package 과거의산물.구현2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> number삼각수 = new ArrayList<>();
        for (int i = 1; i < 45; i++) {
            number삼각수.add(i * (i + 1) / 2);
        }

        for (int i = 0; i < n; i++) {
            int K = Integer.parseInt(br.readLine());
            System.out.println(calculation(K, number삼각수));
        }

    }

    public static int calculation(int K, List<Integer> number삼각수) {
        for (int i = 0; i < number삼각수.size(); i++) {
            for (int j = 0; j < number삼각수.size(); j++) {
                for (int l = 0; l < number삼각수.size(); l++) {
                    if (number삼각수.get(i) + number삼각수.get(j) + number삼각수.get(l) == K) {
                        return 1;
                    }
                }
            }
        }


        return 0;
    }
}