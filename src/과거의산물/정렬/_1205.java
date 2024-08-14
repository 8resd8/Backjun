package 과거의산물.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NNumberP = br.readLine().split(" ");
        int N = Integer.parseInt(NNumberP[0]);
        int number = Integer.parseInt(NNumberP[1]);
        int P = Integer.parseInt(NNumberP[2]);

        if (N == 0) {
            System.out.println(1);
            return;
        }
        String[] input = br.readLine().split(" ");


        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        int min = Collections.min(list);

        // 랭킹에 들어갈 수 없는 경우
        if (number <= min && list.size() == P) {
            System.out.println(-1);
            return;
        }

        // 랭킹리스트가 꽉차있고 새 점수가 더 높은 경우 점수 교체
        if (list.size() == P) {
            list.remove(list.indexOf(min));
        }
        list.add(number);
        Collections.sort(list);

        int rank = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (number == list.get(i)) {
                break;
            } else if (number < list.get(i)) {
                rank++;
            }
        }

        System.out.println(rank);
    }
}