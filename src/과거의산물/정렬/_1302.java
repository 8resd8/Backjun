package 과거의산물.정렬;

import java.util.*;

public class _1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 책 판매량 기록
        for (int i = 0; i < n; i++) {
            String bookName = sc.next();
            hashMap.put(bookName, hashMap.getOrDefault(bookName, 0) + 1);
        }

        int maxSell = 0; // 최대 판매 기록 저장
        List<String> list = new ArrayList<>(); // 최대 판매 책 이름 저장

        // 최대 판매량 개수 확인
        for (Integer value : hashMap.values()) {
            maxSell = Math.max(maxSell, value);
        }

        // 최대 판매량 책 이름 저장
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (maxSell <= entry.getValue()) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list); // 과거의산물.문자열: 사전순 과거의산물.정렬
        System.out.print(list.get(0)); // 여러 개일때 1개 사전순 출력


    }
}