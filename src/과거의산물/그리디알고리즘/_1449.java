package 과거의산물.그리디알고리즘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1449 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 개수
        int k = sc.nextInt(); // 테이프의 길이

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int count = 1;
        int K = list.get(0) + k; // 초기값
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < K) {
                list.set(i, 0);
                continue;
            }
            count++;
            K = list.get(i) + k;
        }

        System.out.println(count);


    }
}