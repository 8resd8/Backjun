package 과거의산물.심화2;

import java.io.*;
import java.util.*;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double 산술평균 = 0;
        int 중앙값 = 0;
        int 최빈값 = 0;
        int 범위 = 0;
        double sum = 0;
        int[] values = new int[n];
        int[] count = new int[8001];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            sum += input;
            values[i] = input;
            if (map.containsKey(input)) {
                map.put(input, map.getOrDefault(input, 0) + 1);
            } else {
                map.put(input, 1);
            }

            min = Math.min(min, input);
            max = Math.max(max, input);
        }

        int frequency = 0;
        for(int i: map.values()) {
            frequency = Math.max(frequency, i);
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == frequency) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        if (list.size() > 1) {
            최빈값 = list.get(1);
        } else {
            최빈값 = list.get(0);
        }

        범위 = max - min;
        Arrays.sort(values);
        산술평균 = Math.round(sum / n);
        중앙값 = values[n / 2];

        System.out.printf("%.0f\n%d\n%d\n%d\n", 산술평균, 중앙값, 최빈값, 범위);

    }
}