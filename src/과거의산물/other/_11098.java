package 과거의산물.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _11098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, String> table = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < p; j++) {
                int cost = sc.nextInt();
                String name = sc.next();
                table.put(cost, name);
            }

            for(Map.Entry<Integer, String> entry: table.entrySet()) {
                if (max <= entry.getKey()) {
                    max = entry.getKey();
                }
            }
            sb.append(table.get(max)).append('\n');
            table.clear();

        }
        System.out.println(sb);

    }
}