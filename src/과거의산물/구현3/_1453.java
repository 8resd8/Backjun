package 과거의산물.구현3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        Set<Integer> set = new HashSet<>();
        int rejectionRate = 0;

        for (String s : input) {
            int i = Integer.parseInt(s);
            if (set.contains(i)) {
                rejectionRate++;
            }
            set.add(i);
        }
        System.out.println(rejectionRate);

    }
}
